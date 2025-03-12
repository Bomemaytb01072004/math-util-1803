package com.morbious;

import com.morbious.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArgMinus2RunsWell();
    }

    //Code các testcase để test hàm chạy đúng hay sai - thực hành tdd
    public static void testFactorialGivenRightArg0RunsWell(){
        int n = 1;
        long expectedResult = 1;
        long actualValue = MathUtility.getFactorial(n);

        System.out.println("Expected: " + expectedResult + ", Actual: " + actualValue);
        System.out.println("Status: " + (expectedResult == actualValue));
    }

    public static void testFactorialGivenRightArg5RunsWell(){
        int n = 5;
        long expectedResult = 120;
        long actualValue = MathUtility.getFactorial(n);

        System.out.println("Expected: " + expectedResult + ", Actual: " + actualValue);
        System.out.println("Status: " + (expectedResult == actualValue));
    }

    public static void testFactorialGivenRightArgMinus2RunsWell(){
        MathUtility.getFactorial(-2);
    }
}