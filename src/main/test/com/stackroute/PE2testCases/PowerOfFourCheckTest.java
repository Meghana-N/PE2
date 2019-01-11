package com.stackroute.PE2testCases;

import com.stackroute.PE2.PowerOfFourCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourCheckTest {
    PowerOfFourCheck p1;
    @Before
    public void setUp()  {
        p1 = new PowerOfFourCheck();
    }

    @After
    public void tearDown() throws Exception {
        p1 = null;
    }

    @Test
    public void checkPowerOfFourSuccess() {
        String actualStr = p1.checkPowerOfFour(256);
        String expectedStr = "Number is a power of 4";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkPowerOfFourFailure() {
        String actualStr = p1.checkPowerOfFour(150);
        String expectedStr = "Number is not a power of 4";
        assertEquals(actualStr,expectedStr);
    }
}