import java.util.*;
public class Solution 
{
    public static String read(int n, int []book, int target)
    {
        

        //you can also use hashing technique..
        // Map<Integer,Integer> map = new HashMap<>();  //(value,index)

        // int i;
        // for(i=0;i<n;i++)
        // {
        //     if(map.containsKey(target-book[i]))
        //     {
        //         return "YES";
        //     }
        //     map.put(book[i],i);
        // }

        // return "NO";



        //sort the book array
        Arrays.sort(book);

        int i=0;
        int j=n-1;

        //it has to read any two books
        while(i<j)
        {
            if(book[i]+book[j]==target)
            {
                return "YES";
            }
            else if(book[i]+book[j]>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return "NO";
    }
}
