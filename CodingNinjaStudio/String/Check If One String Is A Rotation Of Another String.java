import java.util.*;

public class Solution 
{
    public static int isCyclicRotation(String p, String q)  
    {
        
      // TIME LIMIT EXCEEDED IN EVERY BELOW APPROACH
      
        //=============THIRD APPROACH================================================
        String ans = p+p;
        if(p.length()==q.length() && ans.contains(q))
        {
            return 1;
        }
        return 0;

        // ===========SECOND APPROACH==================================================================

        // int n = p.length();
        // int i;
        // //start index value of the result string (that should match q)
        // int start=0;
    
        // for(i=0;i<n;i++)
        // {
        //     if(p.charAt(i)==q.charAt(0))
        //     {
        //         start = i;
        //         String res = p.substring(start) + p.substring(0,start);
        //         if(res.equals(q))
        //         {
        //             return 1;
        //         } 
        //     }
             
        // }
        // return 0;
        // ==============FIRST APPROACH======================================================

        //number of times p will be rotated is (p.length()-1) times
        // int n = p.length();
        // int value = rotate(p,q,n,0);
        // return value;
    }
    // public static int rotate(String p, String q, int k, int count)
    // {
    //     //if string p has been rotated k times..the same string p we will get.
    //     //means after rotation, we were not able to get String q
    //     if(count==k)
    //     {
    //         return 0;
    //     }

    //     //now check if the string p is equal to String q
    //     if(p.equals(q))
    //     {
    //         return 1;
    //     }

    //     //now rotate p one time till count reaches k
    //     //convert string p in character array
    //     char ch[] = p.toCharArray();
        
    //     char last = ch[ch.length-1];
    //     int i;
    //     for(i=ch.length-1;i>=1;i--)
    //     {
    //         ch[i] = ch[i-1];
    //     }

    //     ch[0] = last;

    //     //convert the character array back to string p
    //     p = String.valueOf(ch);
        
    //     return rotate(p, q, k, count+1);
    // }
}
