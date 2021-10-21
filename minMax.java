import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static void miniMaxSum(List<Integer> arr) 
    {
    long min=arr.get(0);
    long max = min;
    long sum=0;
    
    for(int i=0;i<arr.size();i++)
    {
        sum=sum+arr.get(i);
        if(min<arr.get(i)){
            min=arr.get(i);
        }
        if(max>arr.get(i)){
            max = arr.get(i);
        }
        
    }
    System.out.println((sum-min)+" "+(sum-max));
    
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
