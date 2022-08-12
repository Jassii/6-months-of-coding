import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //size of the array..
		
		int arr[] = new int[n];
		//enter the elements of the array..
		int i;
		for(i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		
		boolean value = checkSorted(arr,0);  //store the value in boolean..
		if(value==true)
		{
		    System.out.println("The given array is in strictly increasing order..");    
		}
		else
		{
		    System.out.println("The given array is not in strictly increasing order..");
		}
	}
  //recursive function to check if the array is sorted or not..(in strictly increasing order)..
	public static boolean checkSorted(int arr[],int i)
	{
    //if the i'th value has reached to the end of the index of the array..
	    if(i==arr.length-1)
	    {
	        return true;
	    }
    //if the element at the next index is greater..it means it is sorted..
	    if(arr[i]<arr[i+1])
	    {
	        return checkSorted(arr,i+1); //return 
	    }
	    else
	    {
	        return false;     
	    }
	   
	}
}
