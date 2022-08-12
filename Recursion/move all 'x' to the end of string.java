import java.util.*;
public class Main
{
    //you can pass count value as the static value as well as in the form of parameter as well....
    // static int count=0; //this value should not be changed..it will store the count of x..
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//enter the string..
		String s = sc.next();
		String n = ""; //new string...
		//move all 'x' to the end of the string..
		move(s,0,n,0); //call the function by passing the parameters..
	}
  //recursive function..
	public static void move(String s,int i,String n,int count)
	{
    //base case..
	    if(i==s.length())
	    {
        //this below loop is for adding 'x' at the end of the new string..
	        int j;
	        for(j=1;j<=count;j++)
	        {
	            n = n + Character.toString('x');
	        }
        //print the new string. and simply return the string..
	        System.out.println("The new updated string is "+n);
	        return;
	    }
    //take the character at the particular index..
	    char ch = s.charAt(i);
    //if the character is not equal to the character 'x'..
	    if(ch!='x')
	    {
	        n = n + Character.toString(ch); //convert the character into string and simply add it to the new string.. (by the way there is no neeeeeed)..
	    }
	    else
	    {
	        count++;
	    }
	    move(s,i+1,n,count);
	}
}
