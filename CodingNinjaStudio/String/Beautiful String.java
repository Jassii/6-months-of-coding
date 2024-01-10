import java.util.*;
public class Solution 
{
    public static int makeBeautiful(String str) 
    {
        char ch[] = str.toCharArray();

      //create two arrays, one starting from 0, and another starting from 1..
        char req0[] = str.toCharArray();
        char req1[] = str.toCharArray();
      
        req0[0]='0';
        req1[0]='1';

        int i;
        for(i=1;i<ch.length;i++)
        {
            if(req0[i-1]=='0')
            {
                req0[i]='1';
            }
            else
            {
                req0[i]='0';
            }
            if(req1[i-1]=='1')
            {
                req1[i]='0';
            }
            else
            {
                req1[i]='1';
            }
        }

      //count1 and count2 will maintain the count of both the character array how much it is different
        int count1=0;
        int count2=0;
        for(i=0;i<ch.length;i++)
        {
            if(req0[i]!=ch[i])
            {
                count1++;
            }
            else if(req1[i]!=ch[i])
            {
                count2++;
            }
        }
//return the minimum count
        return Math.min(count1,count2);
    }
}
