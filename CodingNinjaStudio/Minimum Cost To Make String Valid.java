import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int findMinimumCost(String str) 
    {
      //if the length of the string is odd then no way to solve this
      if(str.length()%2!=0) //length of the string is odd
      {
        return -1;
      }
      
      //Now valid part has to be removed from the string

      Stack<Character> stack = new Stack<>();
      int i;
      for(i=0;i<str.length();i++)
      {
        char ch = str.charAt(i);
        if(ch=='{') //opem brace
        {
          stack.push(ch);
        }
        else //ch is an close brace..
        {
          if(!stack.isEmpty() && stack.peek()=='{')
          {
            stack.pop();
          }
          else
          {
            stack.push(ch);
          }
        }
      }

      //now stack will be containing invalid part..as valid part has been 
      //removed in the above code

      //now check the count of a(count of open brace) and b(count of close brace).
      int a=0;
      int b=0;
      while(!stack.isEmpty())
      {
        char ch = stack.peek();
        if(ch=='{') //open brace
        {
          a++;
        }
        else
        {
          b++;
        }

        stack.pop();
      }

      //now i will have the count of a and b..
      
      //for the string which is odd now.
      int tot = a+b;
      if(tot%2!=0)
      {
        return -1;
      }

      //for even..
      int count = (a+1)/2 + (b+1)/2;
      return count;     
    }
}
