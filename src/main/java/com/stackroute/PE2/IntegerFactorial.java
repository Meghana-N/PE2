/**
 * a program to list all the factorials, that can be expressed as an
 * int (i.e., 32-bit signed integer). Your output shall look like:
 * Int Factorials:
 * The factorial of 1 is 1
 * The factorial of 2 is 2
 */
package com.stackroute.PE2;

public class IntegerFactorial {

    /*
    This method will return factorial of number
     */
    public String getFactorial(int number )
    {
        int factorial;
        String replaceString;
        String factorialString;
        factorialString="";
        replaceString="";

        //This loop will compute the factorial
        for( int i=1;i<=number ; i++ )
        {
            factorial =1;
            for( int j=1 ; j<=i ;j++ )
            {
               factorial= factorial*j;
            }
            replaceString=replaceString+"The factorial of "+i+" is "+Integer.toString(factorial)+ "\n";
        }
        for(int i=0;i<replaceString.length()-1 ; i++ )
        {
            factorialString=factorialString+replaceString.charAt(i);
        }
        return factorialString;
    }
}
