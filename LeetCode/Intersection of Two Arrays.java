class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        //Using HashSet
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        int i;
        for(i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }

        // for(i=0;i<nums2.length;i++)
        // {
        //     set.add(nums2[i]);
        // }

        //after the below loop, set2 will have the common elements..
        for(i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                set2.add(nums2[i]);
            }
        }

        int arr[] = new int[set2.size()];

        //Inorder to get the values from the set..this is how you do..
        i=0;
        for(int x : set2)
        {
            arr[i] = x;
            i++;
        }

        return arr;



        // ArrayList<Integer> list = new ArrayList<>();
        // int i;
        // for(i=0;i<nums1.length;i++)
        // {
        //     if(list.contains(nums1[i]))
        //     {
        //         continue;
        //     }
        //     else
        //     {
        //         list.add(nums1[i]);
        //     }
        // }
        // ArrayList<Integer> inter = new ArrayList<>();
        // for(i=0;i<nums2.length;i++)
        // {
        //     if(list.contains(nums2[i]) && !inter.contains(nums2[i]))
        //     {
        //         inter.add(nums2[i]);
        //     }
        // }

        // int arr[] = new int[inter.size()];
        // for(i=0;i<inter.size();i++)
        // {
        //     arr[i] = inter.get(i);
        // }
        // return arr;
    }    
}
