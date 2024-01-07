class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        HashMap<Character,Integer> map = new HashMap<>();
        int i;
        for(i=0;i<line.length();i++)
        {
            char c = line.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        //now map has the count of each characters.
        
        int max = Integer.MIN_VALUE;
        char res=' '; //empty character
      
        //traverse the map and find the character having maximum count...if any keys count matches then select the lexicographiclly smaller character..
        for(Map.Entry<Character,Integer> m : map.entrySet())
        {
          //select max count and its character
            if(m.getValue()>max)
            {
                max = m.getValue();
                res = m.getKey();
            }
              //if the count matches, then select the lexicographiclly smaller character
            else if(m.getValue()==max)
            {
              //update the res character.
                if(m.getKey()<res)
                {
                    res = m.getKey();
                }
            }
        }
      //return the res character..
        return res;
    }    
}
