class Solution 
{
    public boolean isValid(String s) 
    {
        int i;
        Stack<Character> stack = new Stack<Character>();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char ch = stack.peek();
                if(ch!='(')
                {
                    return false;
                }
                stack.pop();
            }
            else if(s.charAt(i)=='}')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char ch = stack.peek();
                if(ch!='{')
                {
                    return false;
                }
                stack.pop();
            }
            else if(s.charAt(i)==']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char ch = stack.peek();
                if(ch!='[')
                {
                    return false;
                }
                stack.pop();
            }            
        }
        if(stack.isEmpty()==false)
        {
            return false;
        }    
        return true;
    }
}
