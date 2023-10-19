import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int i;
      //take by default substring from 0 to k as smallest and largest
        smallest = s.substring(0,k); 
        largest = s.substring(0,k);

      //now create substring from 1 index of the string..and compare each and every string and shorlist smallest and largest substring.
        for(i=1;i<=s.length()-k;i++)   //doing s.length()-k inorder to avoid index out of bounds exception.
        {
            String str = s.substring(i,i+k);  //fetching substring

          //compare both the substring..(if str is < than smallest) (< 0) then update smallest string
            if(str.compareTo(smallest)<0)
            {
                smallest = str;
            }   
              // (if str is > than largest) (> 0) then update largest string
            else if(str.compareTo(largest)>0)
            {
                largest = str;
            }   
        }
        //at last simple return the smallest and largest..
         return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
