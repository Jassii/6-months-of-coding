//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}

// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
    //will be using this function recursively..
    public long toh(int N, int from, int to, int aux) 
    {
        // Your code here
      //if only one disk is there..
        if(N==1)
        {
            System.out.println("move disk "+ N +" from rod " + from + " to rod "+ to );
            return 1; //at last return 1..
        }
      
        //from source to aux using dest as a helper..
        long moves = toh(N-1,from,aux,to);  //store the moves here..
      //then move the Nth disk from source to destination..
        System.out.println("move disk "+ N +" from rod " + from + " to rod "+ to );
      //increase the move..
        moves++; //move one disk from source to dest..hence moves++..
      //now again move N-1 disks from aux to destination using source as a helper..  and add it to the moves..
      moves += toh(N-1,aux,to,from);
        return moves; //return moves....
    }  
}
