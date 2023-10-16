

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

// Write your code here

//flag is just a boolean variable.
static boolean flag=false;

//static variable.
static int B;
static int H;

  //static block
static{
    Scanner sc = new Scanner(System.in);
    //take the breadth and height input
    B = sc.nextInt();
    H = sc.nextInt();
    
    //less than 0..
    if(B<=0 || H<=0)
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag=false; //make the flag variable false..
    }
    else
    {
        //else flag value true
        flag = true;    
    }
    
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

