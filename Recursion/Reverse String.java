import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//print a string in reverse..(Basic method)...
		
		String s = sc.next(); //input of the string..
// 		int i;
// 		for(i=s.length()-1;i>=0;i--)
// 		{
// 		    System.out.print(s.charAt(i)+" ");
// 		}
		
		//print a string in reverse using recursion.
		reverse(s,s.length()-1);
	}
	public static void reverse(String s,int index)
	{
	    if(index==0) //if the index reaches to the 0th index position...print and simply return...
	    {
	        System.out.print(s.charAt(index)+" ");
	        return;
	    }
	    System.out.print(s.charAt(index)+" ");
	    reverse(s,index-1);
	}
}
