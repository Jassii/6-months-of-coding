import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) 
    {
        // Complete the function
        
        //as in the question it is saying that it is case insensitive, it is better to convert both the string into lower case
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length()!=b.length())
        {
            return false;
        }
        
        int arr[] = new int[26];
        int i;
        for(i=0;i<a.length();i++)
        {
            int index = a.charAt(i)-'a';
            arr[index] = arr[index]+1;
        }
        
        for(i=0;i<b.length();i++)
        {
            int index = b.charAt(i)-'a';
            arr[index] = arr[index]-1;
        }
        
        for(i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                return false;
            }
        }
        
        return true;
        
        // char A[] = a.toCharArray();
        // Arrays.sort(A);
        
        // a = new String(A);
        
        // char A[] = b.toCharArray();
        // Arrays.sort(A);
        
        // b = new String(A);
        
        // if(a.equals(b))
        // {
        //     return true;
        // }
        
        // return false;
        
        
        
        //will be doing using hash map
        // HashMap<Character,Integer> map = new HashMap<>();
        
        // int i;
        // for(i=0;i<a.length();i++)
        // {
        //     if(map.get(i)>0)
        //     {
        //        map.put(i,map.get(i)+1);    
        //     }
        //     else
        //     {
        //        map.put(i,1);
        //     }
        // }
        
        // //now i have map which contains frequency of each character of string a.
        
        // for(i=0;i<b.length();i++)
        // {
        //     char ch = b.charAt(i);
        //     if(map.containsKey(ch) && map.get(ch)>0)
        //     {
        //         map.put(ch,map.get(ch)-1);
        //     }
        //     else
        //     {
        //         return false;
        //     }
        // }
        
        // //now its time to traverse the hash map
        
        // for(Map.Entry<Character,Integer> m : map.entrySet())
        // {
        //     if(m.getValue()>0)
        //     {
        //         return false;
        //     }
        // }
        // return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
