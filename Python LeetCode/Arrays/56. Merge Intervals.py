class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        
        #first step is to sort the intervals (so that each list come close to each other)
        intervals.sort()

        #take result list which will contain the merged lists
        result = [] 

        #append the 0th index list of intervals
        result.append(intervals[0])  

        #traverse the intervals list and compare the 0th index of intervals with the 
        # first index of the last list in result list...
        for i in range(1,len(intervals)):
            if(intervals[i][0]<=result[len(result)-1][1]): #if it is smaller(overlapping)
                #put the max of the 1st index of both the lists...
                result[len(result)-1][1] = max(result[len(result)-1][1],intervals[i][1]) 
            else:#if not overlapping append in the result list
                result.append(intervals[i])

        return result            
