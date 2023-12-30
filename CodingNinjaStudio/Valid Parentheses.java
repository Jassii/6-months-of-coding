import java.util.*;
public class Solution 
{
    public static boolean isValidParenthesis(String s) 
    {
        // Write your code here.
        Stack<Character> stack = new Stack<>();

        int i;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                stack.push(ch);
            }
            else if(ch=='}')
            {
                if(stack.isEmpty()==false && stack.peek()=='{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }

            else if(ch==']')
            {
                if(stack.isEmpty()==false && stack.peek()=='[')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(ch==')')
            {
                if(stack.isEmpty()==false && stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
