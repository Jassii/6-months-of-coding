class Solution(object):
    def countNegatives(self, grid):
        #brute force approach
        # i=0
        # j=0
        # count=0
        # for i in range(0,len(grid)):
        #     for j in range(0,len(grid[0])):
        #         if(grid[i][j]<0):
        #             count+=1
        # return count  


        count=0
        #using binary search approach
        for i in range(0,len(grid)):
            arr = grid[i]  #will give the sorted array..
            #find the position of the first negative number
            pos=-1

            s=0
            e=len(arr)-1
            while(s<=e):
                m=s+(e-s)/2
                if(arr[m]<0):
                    pos=m
                    e=m-1
                else:
                    s=m+1

            #suppose negative number is not found
            if(pos==-1):
                continue
            #count the negative numbers
            count += len(arr)-pos

        return count     
