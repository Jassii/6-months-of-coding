//     1
//    212
//   32123
//  4321234
// 543212345


import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int i,j;
        int n = sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            //first we will look into the spaces..
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            //now its time to print the values..(decreasing order)
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            
          //now printing numbers in increasing order..(why starting from 2 bcoz..till 1 we have already printed)..
            for(j=2;j<=i;j++)
            {
                System.out.print(j);
            }
          //fimally change the line..
            System.out.println();
        }
	}
}
