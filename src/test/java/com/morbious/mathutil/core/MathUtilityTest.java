package com.morbious.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //test case with 4
    @Test
    public void testFactorialGivenRightArg4RunsWell(){
        assertEquals(24, MathUtility.getFactorial(4));
    }

    //test case with 3
    @Test
    public void testFactorialGivenRightArg3RunsWell(){
        assertEquals(6, MathUtility.getFactorial(3));
    }

    //test case with 2
    @Test
    public void testFactorialGivenRightArg2RunsWell(){
        assertEquals(2, MathUtility.getFactorial(2));
    }

    //test case with 1
    @Test
    public void testFactorialGivenRightArg1RunsWell(){
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    public void testFactorialGivenRightArg5RunsWell(){
        int n = 5;
        long expectedResult = 120;
        long actualValue = MathUtility.getFactorial(n);

        assertEquals(expectedResult, actualValue);
    }

}