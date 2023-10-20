class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        //convert the string into character array
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();

        //sort both the arrays..
        Arrays.sort(s1);
        Arrays.sort(t1);

        String s2 = new String(s1);
        String t2 = new String(t1);

        if(s2.equals(t2))
        {
            return true;
        }
        return false;

        
        // ------------------------------------------------------------------------------------------


            
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
    }
}
