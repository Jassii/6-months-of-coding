import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int start=0;
        int end = A.length()-1;
        
        while(start<=end)
        {
            if(A.charAt(start)==A.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                break;
            }
        }
        if(start>end)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
