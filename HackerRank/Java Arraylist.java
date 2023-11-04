import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of lines
        
        //creating 2d arraylist
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        
        int i;
        //traversing the lines
        for(i=0;i<n;i++)
        {
            //size of each line
            int d = sc.nextInt();
            ArrayList<Integer> alist = new ArrayList<>();
            //filling the values of each line
            for(int j=0;j<d;j++)
            {
                int value = sc.nextInt();
                alist.add(value);
            }
            arrayList.add(alist);
        }
        
        int q = sc.nextInt();
        for(i=0;i<q;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>n)
            {
                System.out.println("ERROR!");
                continue;
            }
            
            ArrayList<Integer> arr = arrayList.get(x-1); //return the arraylist
            
            if(y>arr.size())
            {
                System.out.println("ERROR!");
                continue;
            }
            
            int value = arr.get(y-1);
            
            System.out.println(value);   
        }
    }
}
