import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsEvenCheckTest {
    IsEvenCheck e1;
    @Before
    public void setUp()  {
        e1 = new IsEvenCheck();
    }

    @After
    public void tearDown() throws Exception {
        e1 = null;
    }

    @Test
    public void checkIsEvenSuccess() {
        Boolean actualStr = p1.checkIsEven(56);
        Boolean expectedStr = "True";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkIsEvenFailure() {
        Boolean actualStr = p1.checkIsEven(53);
        Boolean expectedStr = "False";
        assertEquals(actualStr,expectedStr);
    }
}