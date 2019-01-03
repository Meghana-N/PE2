public class PalindromeCheck {

    public String checkPalindrome(String pallindrome)
    {
        String revpal;
        revpal="";
        for( int i= pallindrome.length()-1 ; i>= 0 ; --i)
        {
            revpal=revpal+pallindrome.charAt(i);
        }
        //System.out.println(revpal);
        if( revpal.equals(pallindrome) )
        {
            return "Palindrome";
        }
        else
        {
            return "Not Palindrome";
        }

    }
}
