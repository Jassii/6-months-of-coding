public class Solution 
{
    public static int[] alternateNumbers(int []a) 
    {
        //brute force approach
        int pos[] = new int[a.length/2];
        int neg[] = new int[a.length/2];

        int i;
        int j=0;
        int k=0;
        for(i=0;i<a.length;i++)
        {
            //positive integer
            if(a[i]>0)
            {
                pos[j]=a[i];
                j++;
            }
            else
            {
                neg[k]=a[i];
                k++;
            }
        }

        // pos = [1,2]  2
        // neg = [-4,-5]  2
        // a = [1,-4,2]


        //now traverse both the array and take elements alternatively
        //from both the arrays
        j=0;
        k=0;
        i=0;
        while(j<pos.length || k<neg.length)
        {
            //for even position
            if(i%2==0)
            {
                a[i]=pos[j];
                i++;
                j++;
            }
            else
            {
                a[i]=neg[k];
                k++;
                i++;
            }
        }
        return a;
    }
}
