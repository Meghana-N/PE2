import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberVariableDisplayTest {
    @Before
    public void setUp()
    {
        MemberVariableDisplay object = new MemberVariableDisplay();
    }

    @After
    public void tearDown(){
        object = null;
    }

    @Test
    public void testSuccess() throws Exception{
        String expectedName = "Harry Potter";
        String actualName = object.MemberName("Harry Potter");
        assertEquals(expectedName,actualName);

        int expectedAge = 30;
        int actualAge = object.MemberAge(30);
        assertEquals(expectedAge,actualAge);

        String expectedSalary = "2500.3";
        String actualSalary = object.MemberSalary("2500.3");
        assertEquals(expectedSalary,actualSalary);
    }

    @Test
    public void testFailure() throws  Exception{
        String actualName = object.MemberName(null);
        assertNull(actualName);

        int actualAge = object.MemberAge(null);
        assertNull(actualAge);

        String actualSalary = object.MemberSalary(null);
        assertNull(actualSalary);
    }
}