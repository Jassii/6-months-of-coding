import java.util.*;
public class Solution 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); //input the one word string and get the
        //0th character as input
        if(ch>='A' && ch<='Z')
        {
            System.out.println("1");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("-1");
        }
    }
}
