
import java.io.IOException;
import java.lang.reflect.Method;

//using generic class to solve this problem
====================================================================================================
class Printer<T>
{
   //Write your code here
   public void printArray(T array[])  //generic method
   {
       int i;
       //traverse the array and print values no matter whatever is the type of the array
       for(i=0;i<array.length;i++)
       {
           System.out.println(array[i]);
       }
   }
 
}
=====================================================================================================
public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
