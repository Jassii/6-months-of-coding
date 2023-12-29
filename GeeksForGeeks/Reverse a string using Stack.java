class Solution 
{
    public String reverse(String S)
    {
        //code here

      //initialize a stack
        Stack<Character> stack = new Stack<>();
        int i;
      //traverse the string and push each character in the stack
        for(i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            stack.push(ch);
        }
        
        String str = ""; //empty string..
        
        //now we will pop the Stack and make a string with that..
        while(!stack.isEmpty())
        {
            char c = stack.pop();
            str = str + String.valueOf(c);
        }
      //return the final generated string.
        return str;
    }
}
