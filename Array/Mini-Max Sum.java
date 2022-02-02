// Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of 5 elements.
  
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) 
    {
        // Write your code here
        
        //just sort the list..for max subtract 0th index value from total sum..
        //for min subtract (n-1)index value from the total sum.
        
        //sort the list
        Collections.sort(arr);
        
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum = sum+arr.get(i);
        }
        
        max = sum-arr.get(0);
        min = sum-arr.get(arr.size()-1);
      
        System.out.print(min+" "+max);
        
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
  
