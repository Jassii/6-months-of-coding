import java.util.*;
public class Main
{
    //doing static initializing the start and end index value for recursion....
    static int start = -1;
    static int end = -1;
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//find the first and last occurence of the element in the string.
    
		String s = sc.next(); //input of the string..
    char element = sc.next().charAt(0);
    
//basic method using loops..
    
//         int i;
//         int first = -1;
//         int last = -1;
//         for(i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)==element && first==-1)
//             {
//                 if(first==-1)
//                 {
//                     first = i; //for one time update the first index..
//                     last = i; //there can be a scenario that the first and the last index position is same..    
//                 }
//                 else
//                 {
//                     last = i; //update the last index..
//                 }    
//             }
//         }
//         System.out.println("The first index position is "+first);
//         System.out.println("The last index position is "+last);
// 	}

    
//now trying to do using recursion..
        
        occurence(s,element,0);
        System.out.println("First occurence is "+start);
        System.out.println("Last occurence is "+end);
	}
  //recursive function..
	public static void occurence(String s,char element,int index)
	{
	    if(index==s.length())
	    {
	        return;
	    }
	    if(s.charAt(index)==element)
	    {
	        if(start==-1)
	        {
	            start = index;
	            end = index;
	        }
	        else
	        {
	            end = index;
	        }
	    }
	    occurence(s,element,index+1);
	}
}
