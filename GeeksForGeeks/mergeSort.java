class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        
        //take a random array which will store the value in sorted manner
        int merged[] = new int[r-l+1]; //+1 bcoz 0 based index is there.
        
        int i = l; //index of the first array 
        int j = m+1; //index of the second array
        
        int k = 0; //index of the merged array
        
        //traverse first and second array
        while(i<=m && j<=r)
        {
            if(arr[i]<=arr[j])
            {
                merged[k] = arr[i];
                k++;
                i++;
            }
            else
            {
                merged[k] = arr[j];
                k++;
                j++;
            }
        }
        
        //suppose one of the array is not traversed..
        while(i<=m)
        {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while(j<=r)
        {
            merged[k] = arr[j];
            j++;
            k++;
        }
        
        //j=l because, it is not necessary that we are merging the array whose
        //first index is 0, it can be any number..based on the l value passed
        //to this function..
        for(i=0,j=l;i<merged.length;i++,j++)
        {
            arr[j] = merged[i];
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        
        //min two elements should be there
        if(l<r)
        {
            int mid = l + (r-l)/2; //found the mid element..
            
            //now dividing the array into two parts.
            
            mergeSort(arr,l,mid); //left side
            mergeSort(arr,mid+1,r); //right side
            merge(arr,l,mid,r);//now merge both the arrays in the sorted manner
        }
    }
}
