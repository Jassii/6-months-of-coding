import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int[] computeLPSArray(String p,int m, int lps[])
    {
        int len=0;
        int i=1;
        lps[0]= 0;
        while(i<m)
        {
            if(p.charAt(i)==p.charAt(len))
            {
                lps[i]=len+1;
                i++;
                len++;
            }
            else//when there is a mismatch
            {
                if(len!=0)
                {
                    len = lps[len-1];
                }
                else
                {
                    lps[i]=len;
                    i++;
                }  
            }
        }
        return lps;
    }
    public static boolean findPattern(String p, String s) 
    {
        //KMP ALGORITHM
        
        int m = p.length(); //length of pattern
        int n = s.length(); //length of the text string

        //create a lps[] array of the pattern string.
        int lps[] = new int[m];

        //compute lps array
        lps = computeLPSArray(p,m,lps);

        int i = 0; //index for the text string
        int j = 0; //index for pattern string..
        while(i<n-m+1)
        // while((n-i)>=(m-j))
        {
            if(s.charAt(i)==p.charAt(j))
            {
                i++;
                j++;
            }
            
            
            // else if(i<n && p.charAt(j)!=s.charAt(i))
            else
            {
                //below condition has to be done only when j is not at 0.
                //hence it will go array index out of exception
                if(j!=0)
                {
                    int value = lps[j--];
                    j = value;
                }
                else //means that j is at position 0.
                {
                    i++;
                }
            }
            //traversed till the last index of the pattern
            if(j==m)
            {
                //there can be more substrings in the string.
                j = lps[j-1];
                return true;
            }
            
        }
        return false;

        // return (s).contains(p);
    }
}
