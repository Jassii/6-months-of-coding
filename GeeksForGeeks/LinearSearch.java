import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {1,4,5,6,2};
	    int key = 6;
	    int value = isFound(arr,key,arr.length);
	    System.out.println(value);
	}
	public static int isFound(int arr[],int key,int n)
	{
	    if(n==0)
	    {
	        return -1;
	    }
	    if(arr[n-1]==key)
	    {
	        return n-1; //return the index of the value..
	    }
	    return isFound(arr,key,n-1);
	}
}
