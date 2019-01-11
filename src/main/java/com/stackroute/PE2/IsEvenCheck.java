/**
 * a boolean method called isEven() in a class called EvenNumTest,
 * which takes an int as input and returns true if the input is even.
 * The signature of the method is as follows: p
 * ublic static boolean isEven(int number)
 */
package com.stackroute.PE2;

public class IsEvenCheck {
    /*
    This method will check whether the number is even or not
    and return boolean value according to that.
     */
    public static boolean checkIsEven(int number)
    {
        if(number%2 != 0 )
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
