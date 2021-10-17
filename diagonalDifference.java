// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("The Diagonal Difference!"); 
         // List of Lists
        ArrayList<List<Integer> > listOfLists
            = new ArrayList<List<Integer> >();
  
        // Create N lists one by one
        // and append to the list of lists
        List<Integer> list1
            = new ArrayList<Integer>();
        list1.add(11);
        list1.add(2);
        list1.add(4);
        listOfLists.add(list1);
        

        
         List<Integer> list3
            = new ArrayList<Integer>();
        list3.add(4);
        list3.add(5);
        list3.add(6);
        listOfLists.add(list3);
        
        List<Integer> list2
            = new ArrayList<Integer>();
        list2.add(10);
        list2.add(8);
        list2.add(-12);
        listOfLists.add(list2);
        
        
        
        System.out.println("diagonal difference is "+diagonalDifference(listOfLists)); 
        
        
    }
    
    
public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sum1 =0;
    int sum2 =0;
    
    for(int i=0; i<=arr.size()-1; i++)
    {
        sum1 = sum1+arr.get(i).get(i);    
        
    }
    
    System.out.println("sum1 is "+sum1);
    int count =-1;
    for(int i=arr.size()-1; i>=0; i--)
    {
        count=count+1;
        sum2 = sum2+arr.get(i).get(count);    
        
    }
    System.out.println("sum2 is"+sum2);

    return Math.abs(sum2-sum1);

    }
}
