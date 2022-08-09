import java.util.*;
public class Main
{
    public static int towerOfHanoi(int n,String src,String helper,String dest,int value)
    {
        if(n==1)
        {
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            value++;
            return value;
        }
        towerOfHanoi(n-1,src,dest,helper,value); //source to helper using destination as a helper.
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        value++;
        towerOfHanoi(n-1,helper,src,dest,value); //transfer of (n-1) disks from helper to destination using source as a helper..
    }
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int v = towerOfHanoi(n,"S","H","D",0);
		System.out.println("Total number of counts is "+v);
	}
}
