// There is a hidden integer array arr that consists of n non-negative integers.

// It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

// You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

// Return the original array arr. It can be proved that the answer exists and is unique.

// Input: encoded = [1,2,3], first = 1
// Output: [1,0,2,1]
// Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]

// Since that encoded[i] = arr[i] XOR arr[i+1], then arr[i+1] = encoded[i] XOR arr[i].

class Solution 
{
    public int[] decode(int[] encoded, int first) 
    {
        int arr[] = new int[encoded.length+1]; //size will be one greater
        int i;
        
        arr[0]=first;  //first is the value of 0th index in (arr)
        for(i=0;i<arr.length-1;i++)
        {
            arr[i+1] = encoded[i]^arr[i];  //^ this symbol tells about the XOR operator.
        }
        return arr;
    }
}
