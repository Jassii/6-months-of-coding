import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//enter the string..
		String s = sc.next();
		
		//question is to remove the duplicates present in the string and return the final string..
		//call the recursive function...(passing string,index,new string)..as a parameter.. 
		duplicates(s,0,"");
	}
	
	//the recursive function to remove the duplicates..
	public static void duplicates(String s,int i,String n)
	{
	    //when the index has reached to the end of the String..then simply print the new string and return.
	    if(i==s.length())
	    {
	        System.out.println("New String without the duplicate is "+n);
	        return;
	    }
	    char ch = s.charAt(i);//current character..
	    if(n.contains(Character.toString(ch))==false) //the "new string" does not contain the character...then simply add it to
	    //the new string..
	    {
	        n = n + ch;
	    }
	    duplicates(s,i+1,n); //calling itself with the next index..
	}
}


//another method to do this question..
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//enter the string..
		String s = sc.next();
		
		boolean map[] = new boolean[26]; //this will store the boolean values..
		//and we want that it should store false in the beginning..
		Arrays.fill(map,false); //this will put the value "false" in the array..
		removeDup(s,map,0,"");
	}
	public static void removeDup(String s,boolean map[],int i,String n){
	    
	    //base case..
	    if(i==s.length()) //if the count of the index has reached to the end of the index..
	    {
	        //print the new string..
	        System.out.println("The final string with no duplicate is "+n);
	        return;
	    }
	    char ch = s.charAt(i);
	    //now for this character check if the value at its index is false or true..
	    int index = ch - 'a';
	    if(map[index]==false) //by "false" it means that it has appeared only once..
	    {
	        n = n + ch; //add that character to the new string..
	        map[index] = true; //update the value at that index..(so that duplicacy is not there..)
	    }
	    removeDup(s,map,i+1,n);
	}
}
