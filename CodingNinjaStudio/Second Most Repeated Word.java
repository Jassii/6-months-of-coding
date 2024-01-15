import java.util.* ;
import java.io.*; 
public class Solution 
{

    public static String second_repeat(String[] arr, int n) 
    {
        
        // Write your Code here
        Map<String,Integer> m = new HashMap<>();
        int i;
        for(i=0;i<n;i++)
        {
            if(m.containsKey(arr[i]))
            {
                m.put(arr[i],m.get(arr[i])+1);
            }
            else
            {
                m.put(arr[i],1);
            }
        }

        //now i have stored the strings with its count
        
        int max_value=Integer.MIN_VALUE; 
        String max_key = "";
        for(Map.Entry<String,Integer> map : m.entrySet())
        {
            if(map.getValue()>max_value)
            {
                max_value = map.getValue();
                max_key = map.getKey();
            }    
        }
        
        int max_value2 = Integer.MIN_VALUE;
        String max_key2 = "";
        for(Map.Entry<String,Integer> map : m.entrySet())
        {
            if(map.getValue()<max_value && map.getValue()>max_value2)
            {
                max_value2 = map.getValue();
                max_key2 = map.getKey();
            }    
        }
        return max_key2;
    }
}
