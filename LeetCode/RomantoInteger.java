// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

 

// Example 1:

// Input: s = "III"
// Output: 3
// Explanation: III = 3.
// Example 2:

// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
// Example 3:

// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


class Solution {
    public int romanToInt(String s) 
    {
        char ch[] = s.toCharArray(); //String into character array..
        int i,num=0;
        for(i=0;i<ch.length;i++)
        {
            if(ch[i]=='I')
            {
                if((i+1)<ch.length && ch[i+1]=='V')
                {
                    num = num + 4;
                    i++;
                }
                else if((i+1)<ch.length && ch[i+1]=='X')
                {
                    num = num+9;
                    i++;
                }
                else
                {
                    num = num+1;
                }
            }
            else if(ch[i]=='V')
            {
                num = num + 5;
            }
            else if(ch[i]=='X')
            {
                if((i+1)<ch.length && ch[i+1]=='L')
                {
                    num = num + 40;
                    i++;
                }
                else if((i+1)<ch.length && ch[i+1]=='C')
                {
                    num = num + 90;
                    i++;
                }
                else
                {
                    num = num + 10;
                }
            }
            else if(ch[i]=='L')
            {
                num = num + 50;
            }
            else if(ch[i]=='C')
            {
                if((i+1)<ch.length && ch[i+1]=='D')
                {
                    num = num + 400;
                    i++;
                }
                else if((i+1)<ch.length && ch[i+1]=='M')
                {
                    num = num + 900;
                    i++;
                }
                else
                {
                    num = num + 100;
                }
            }
            else if(ch[i]=='D')
            {
                num = num + 500;
            }
            else
            {
                num = num + 1000;
            }
        }
        return num;
    }
}
