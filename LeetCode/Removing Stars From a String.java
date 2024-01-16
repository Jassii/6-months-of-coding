class Solution 
{
    public String removeStars(String s) 
    {
        Stack<Character> stack = new Stack<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*' && !stack.isEmpty())
            {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }

        StringBuffer str = new StringBuffer();
        while(!stack.isEmpty())
        {
            str.append(stack.pop());
        }
        str.reverse();
        String res = str.toString();
        return res;
    }
}
