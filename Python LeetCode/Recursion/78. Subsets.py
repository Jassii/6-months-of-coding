class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        
        #result 2d list
        result = []

        #for empty list
        result.append([])

        #now traverse the nums and store each value in list..and add it with list in result
        for i in range(0,len(nums)):
            arr = list()  
            temp = []  #2d list which will be added with the final result list
            arr.append(nums[i])

            #traverse the result
            #fetch each list and append value of type list in temp 2d list
            for l in result:
                temp.append(l+arr)
            #append the list values in one 2d list    
            result = result + temp

        return result             
