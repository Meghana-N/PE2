import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    PalindromeCheck p1;
    @Before
    public void setUp()  {
        p1 = new PalindromeCheck();
    }

    @After
    public void tearDown() throws Exception {
        p1 = null;
    }

    @Test
    public void checkPalindromeSuccess() {
        String actualStr = p1.checkPalindrome("abcba");
        System.out.println(actualStr);
        String expectedStr = "Palindrome";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkPalindromeFailure() {
        String actualStr = p1.checkPalindrome("1546");
        String expectedStr = "Not Palindrome";
        assertEquals(actualStr,expectedStr);
    }
}