package com.stackroute.PE2testCases;

import static org.junit.Assert.*;

import com.stackroute.PE2.MemberVariableDisplay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberVariableDisplayTest {
    MemberVariableDisplay object;
    @Before
    public void setUp()
    {
        object = new MemberVariableDisplay();
    }

    @After
    public void tearDown(){
        object = null;
    }

    @Test
    public void testSuccess() throws Exception{
        String expectedName = "Harry Potter";
        String actualName = object.memberName("Harry Potter");
        assertEquals(expectedName,actualName);

        int expectedAge = 30;
        int actualAge = object.memberAge(30);
        assertEquals(expectedAge,actualAge);

        String expectedSalary = "2500.3";
        String actualSalary = object.memberSalary("2500.3");
        assertEquals(expectedSalary,actualSalary);
    }

    @Test
    public void testFailure() throws  Exception{

        String actualName = object.memberName(null);
        assertNull(actualName);

        int actualAge = object.memberAge(0);
        int expectedAge=0;
        assertEquals(expectedAge,actualAge);

        String actualSalary = object.memberSalary(null);
        assertNull(actualSalary);
    }
}