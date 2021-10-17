// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
         // List of Lists
        ArrayList<List<Integer> > listOfLists
            = new ArrayList<List<Integer> >();
  
        // Create N lists one by one
        // and append to the list of lists
        List<Integer> list1
            = new ArrayList<Integer>();
        list1.add(-4);
        list1.add(3);
        list1.add(-9);
        list1.add(0);
        list1.add(4);
        list1.add(1);


        
        
        System.out.println("diagonal difference is "); 
        plusMinus(list1);
        
        
    }
    
    
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float sum1=0;
    float sum2 =0;
    float sum3=0;
    
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)<0){
            sum1=sum1+1;
        }else if(arr.get(i)>0){
            sum2 = sum2+1;
        }else{
            sum3 = sum3+1;
        }
    }
    System.out.println("SUm1 = "+sum1+"sum2 is "+sum2+"sum3 is "+sum3);
    
    
    System.out.println(sum1/arr.size() +"\n"+ sum2/arr.size()+"\n" +sum3/arr.size() );

    }
}
