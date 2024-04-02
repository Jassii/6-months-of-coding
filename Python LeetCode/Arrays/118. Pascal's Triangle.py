class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result=[]
        for i in range(0,numRows):
            k=list()
            for j in range(0,i+1):
                if (j==0 or j==i):
                    k.append(1)
                else:
                    value = result[i-1][j-1]+result[i-1][j]
                    k.insert(j,value) 
            result.append(k)        
        return result                
