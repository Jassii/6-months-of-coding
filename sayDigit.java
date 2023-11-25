import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String arr[]  = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	    
	    //reversing the number..and passing it..
	    
	   // int sum=0;
	   // while(n>0)
	   // {
	   //     int l = n%10;
	   //     sum = sum*10 + l;
	   //     n = n/10;
	   // }
	   //sayDigit(sum,arr)
	   
	    sayDigit(n,arr);
	}
	public static void sayDigit(int n,String arr[])
	{
	    if(n==0)
	    {
	        return;
	    }
	    
	    //now fetching the last digit..which will be the actual first digit..
	    int l = n%10;
	   // System.out.println(arr[l]+" ");
	    n = n/10;
	    sayDigit(n,arr);
	    
	    System.out.print(arr[l]+" ");  //print it over here...inorder to avoid reversing the number
	}
}
