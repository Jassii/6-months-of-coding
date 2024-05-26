class Solution(object):
    def intersection(self, nums1, nums2):
        
        #optimized approach usage of sets..
        set1=set()
        set2=set()
        result=[]
        for num in nums1:
            set1.add(num)
        for num in nums2:
            set2.add(num)

        for num in set1:
            if(num in set2):
                result.append(num)  

        return result          



        
        #another method
        # intersection=[]
        # if(len(nums1)<len(nums2)):
        #     for num in nums1:
        #         if(num in nums2):
        #             if(num not in intersection):
        #                 intersection.append(num)
        #     return intersection   
        # else:
        #     for num in nums2:
        #         if(num in nums1):
        #             if(num not in intersection):
        #                 intersection.append(num)
        #     return intersection  

        #brute force approach
        # intersection=[]
        # for num in nums1:
        #     if(num in nums2):
        #         if(num not in intersection):
        #             intersection.append(num)
        # return intersection            
        
