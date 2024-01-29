import java.util.*;
public class Solution 
{
    public static void reverse(List< Integer > A,int s,int l)
    {
        while(s<=l)
        {
            int temp = A.get(s);
            A.set(s,A.get(l));
            A.set(l,temp);
            s++;
            l--;
        }
    }
    public static List< Integer > nextGreaterPermutation(List< Integer > A) 
    {
        //try to find the long prefix pattern

        //index of the break point..
        int index=-1;
        
        //why starting from A.size()-2 ??

        //it is because the first break point can occur at the 2nd last position not
        //before that..so make sure you keep that in mind.
        
        int i;
        for(i=A.size()-2;i>=0;i--)
        {
            //as soon as you find the break point, break it..
            if(A.get(i)<A.get(i+1))
            {
                index=i;
                break;
            }
        }

        //if break point is not found (array list is already the largest lexicographically
        //array list)..just simply reverse it and return the array list
        if(index==-1) //edge case
        {
            //reverse the array and return it..
            reverse(A,0,A.size()-1);
            return A;
        }


        //find the smallest element which is greater than the i'th element
        //from the last till the (i+1) position..
        for(i=A.size()-1;i>=index+1;i--)
        {   
            //if the i'th value is greater then the index position value..
            if(A.get(i)>A.get(index))
            {
                //swap the values and break it
                int minValue = A.get(i);
                A.set(i,A.get(index));
                A.set(index,minValue);
                break;
            }
        }

        //after the swapping the right side elements will
        //array list will still be in a decreasing manner...
        //simply reverse the remaining array list and return it

        //reverse from index+1 to n-1
        reverse(A,index+1,A.size()-1);

        return A;
    }
}
