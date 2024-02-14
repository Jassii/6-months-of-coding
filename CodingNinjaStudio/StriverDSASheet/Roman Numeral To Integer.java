import java.util.*;
public class Solution {
    public static int romanToInt(String s) {
       
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);  
        
        //traverse from the backkkkkkkkkkk

        //maintain the sum first by taking the last index value
        int sum=map.get(s.charAt(s.length()-1));

        //traverse from the second last index of the string
        int i;
        for(i=s.length()-2;i>=0;i--)
        {
            //if the current index value is less than the next index value.
            //subtract it..
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
            {
                sum = sum - map.get(s.charAt(i));
            }
            //else add it..
            else
            {
                sum = sum + map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
