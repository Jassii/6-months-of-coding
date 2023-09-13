//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        String str[] = {" ","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        // code here
        int i;
        String ret = "";
        for(i=0;i<S.length();i++)  //GFG
        {
            char ch = S.charAt(i); //character.. G
            int j;
            for(j=0;j<str.length;j++)
            {
                if(j!=1)
                {
                    String s = str[j];  //"GHI"
                    if(s.contains(String.valueOf(ch)))
                    {
                        int k,count=1;
                        for(k=0;k<s.length();k++)
                        {
                            if(s.charAt(k)!=ch)
                            {
                                count++;
                            }
                            else
                            {
                                break;
                            }
                        }
                        String no = "";
                        for(k=0;k<count;k++)
                        {
                           no = no + String.valueOf(j); 
                        }
                        ret = ret + no;
                    }
                }
            }
        }
        return ret;
    }
}
