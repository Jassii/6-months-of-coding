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
    }
}
