/**
 * a Java method to Reverse the given input & Check if it is a Palindrome.
 */
package com.stackroute.PE2;

public class PalindromeCheck {

    /*
    This method will check whether the String is pallindrome or not
     */
    public String checkPalindrome(String pallindrome)
    {
        String reversePallindrome;
        reversePallindrome="";
        for( int i= pallindrome.length()-1 ; i>= 0 ; --i)
        {
            reversePallindrome=reversePallindrome+pallindrome.charAt(i);
        }

        //Comparing reverse pallindrome with original pallindome
        if( reversePallindrome.equals(pallindrome) )
        {
            return "Palindrome";
        }
        else
        {
            return "Not Palindrome";
        }

    }
}
