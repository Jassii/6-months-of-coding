//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String A = sc.nextLine().trim();
            String B = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sameChar(A, B));
        }
    }
}
// } Driver Code Ends

####################################################################################################################

//User function Template for Java
class Solution 
{ 
    int sameChar(String A, String B) 
    {
        // code here
        
        //convert both the string into lower case
        A = A.toLowerCase();
        B = B.toLowerCase();
        
        
        //traverse till the length
        int i,count=0;
        for(i=0;i<A.length();i++)
        {
          //check if both the characters is same or not
          //if same then increase the count
            if(A.charAt(i)==B.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
} 
