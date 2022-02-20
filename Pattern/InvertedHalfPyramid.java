import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    //Inverted half Pyramid (suppose n=5)
	    
	    //* * * * * *
	    //* * * * *
	    //* * * *
	    //* * *
	    //* *
	    //*
	    
	    Scanner sc = new Scanner(System.in);
	    
	    //In this only variable 'n' is given.(taken as the input) 
	    int n = sc.nextInt();
	    
	    int i,j;
	    for(i=1;i<=n;i++)  //remember first loop is for number of rows..
	    {
	        //inner loop is for printing
	        for(j=5;j>=i;j--)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
