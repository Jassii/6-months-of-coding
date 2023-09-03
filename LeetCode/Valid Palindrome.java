class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String str = "";
        int i;
        s = s.toLowerCase(); //to lower case

        // for(i=0;i<s.length();i++)
        // {
        //     char ch = s.charAt(i); 
        //     if((ch>=97 && ch<=122) || (ch>='0' && ch<='9'))
        //     {
        //         str = str + String.valueOf(ch);
        //     }
        // }
        // i=0;
        // // System.out.println(str);
        // int j=str.length()-1;
        // while(i<=j)
        // {
        //     char l = str.charAt(i);
        //     char r = str.charAt(j);
        //     if(l==r)
        //     {
        //         i++;
        //         j--;
        //     }
        //     else
        //     {
        //         return false;
        //     }
        // }
        // return true;
        
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                str = str + String.valueOf(ch);
            }
        }

        i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;

    }
}
