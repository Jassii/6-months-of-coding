// Print the ratios of positive, negative and zero values in the array.
// Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) 
    {
        // Write your code here
        
        //first traverse the array..
        double pos=0,neg=0,zero=0;
        int i;
        for(i=0;i<arr.size();i++)
        {
            if(arr.get(i)>0)
            {
                pos++;
            }
            else if(arr.get(i)<0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
        }
        //now we will have pos,neg and zero values..
        double num = arr.size(); //total number of values in the list.
        
        double p = pos/num;
        double n = neg/num;
        double z = zero/num;
        
        //one method to print the output with the desired decimal places..
        // System.out.printf("%.6f \n",p);
        // System.out.printf("%.6f \n",n);
        // System.out.printf("%.6f \n",z);
        
        //another method to print the output with the desired decimal places..
        System.out.println(String.format("%.6f",p));
        System.out.println(String.format("%.6f",n));
        System.out.println(String.format("%.6f",z));
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
