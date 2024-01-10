import java.util.* ;
import java.io.*; 

class Solution {

  public static String stringReverse(char[] arr) 
  {
    // Write your code here.
    int s=0;
    int l=arr.length-1;
    while(s<=l)
    {
      char temp = arr[s];
      arr[s] = arr[l];
      arr[l] = temp;
      s++;
      l--;
    }

    String str = new String(arr);
    return str;

  }
}
