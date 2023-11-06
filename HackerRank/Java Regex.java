import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}


//I just have to write the regex and based on that I have to create a pattern which will compare it the String input by the user.

//Write your code here
class MyRegex
{
  
    //below are the cases..
    
    // 1  (0-9)-> [0-9]
    // 2  (10-99)-> [0-9][0-9]
    // 3  (000 - 199)-> (0|1)[0-9][0-9]
    // 4  (200 - 249)-> 2[0-4][0-9]
    // 5  (250 - 255)-> 25[0-5]
    
    String reg = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";  //here is the regex
    String pattern = reg+"."+reg+"."+reg+"."+reg;  //this is the pattern
}
