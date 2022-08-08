class Solution 
{
    public int fib(int n) 
    {
        int a=0; //first value..
        int b=1; //second value..
        int value = fibo(n); //call the function.
        return value;
    }
    //use the method of recursion.
    public int fibo(int n)
    {
        if(n<=1)//if n is 1 or less than..simply return value n..
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
