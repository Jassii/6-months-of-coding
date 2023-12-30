import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static boolean findRedundantBrackets(String s) 
    {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            //if ch is openeing brackets or any operator
            if(ch=='(' || ch=='+'|| ch=='-'|| ch=='*'|| ch=='/')
            {
                stack.push(ch);
            }
            else 
            {
                if(ch==')')
                {
                    boolean isRedundant = true;
                    while(stack.peek()!='(')
                    {
                        char top = stack.peek();
                        if(top=='(' || top=='+'|| top=='-'|| top=='*'|| top=='/')
                        {
                            isRedundant = false;
                        }
                        stack.pop();
                    }
                    //check if it is redundant
                    if(isRedundant==true)
                    {
                        return true;
                    }

                    stack.pop(); //pop '(' this character..
                }
            }
        }
        return false;
    }
}
