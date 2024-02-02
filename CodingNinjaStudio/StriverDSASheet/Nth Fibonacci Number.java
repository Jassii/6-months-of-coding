import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		
		//need to print the nth fibonacci number
		int i;
		int sum = 0;
		for(i=0;i<n;i++)
		{
			sum = a+b;
			a=b;
			b=sum;
		}
		// while(n!=0)
		// {
		// 	sum = a+b;
		// 	a = b;
		// 	b = sum;
		// 	n--;
		// }
		System.out.println(a);
	}
}
