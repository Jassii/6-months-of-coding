// Sample Input

// 07:05:45PM
// Sample Output

// 19:05:45
  
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) 
    {
        // Write your code here
        
        // "07:05:45PM"
        
        //last two characters of the string..
        String t = s.substring(s.length()-2);
        String f = s.substring(0,2);
        
        if(t.equals("AM") && f.equals("12"))
        {
            s = "00" + s.substring(2,s.length()-2); 
        }
        else if(t.equals("AM") && !(f.equals("12")))
        {
            s = s.substring(0,s.length()-2);
        }
        else if(t.equals("PM") && f.equals("12"))
        {
            s = s.substring(0,s.length()-2);
        }
        else if(t.equals("PM") && !(f.equals("12")))
        {
            int num = 12 + Integer.parseInt(f);
            s = Integer.toString(num) + s.substring(2,s.length()-2);
        }
         return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
  
