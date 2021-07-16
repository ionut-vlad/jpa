package com.math;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }
    
    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }
    
    @Before
    public void before() {
        System.out.println("before test");
    }
    
    @After
    public void after() {
        System.out.println("after testr");
    }

    @Test
    public void success() throws Exception {
        System.out.println("success");
        //GIVEN
        int first = 0;
        int second = 1;
        int expectedOutput = 1;
        
        //WHEN 
        Calculator calculator = new Calculator();
        int actualOutput = calculator.sum(first, second);
        //THEN
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullObj() throws Exception {
        System.out.println("testNullObj");
        //GIVEN
        Integer first = null;
        int second = 3;
        
        //WHEN 
        Calculator calculator = new Calculator();
        int actualOutput = calculator.sum(first, second);
    }
    
    @Test
    public void calculateNumbersSumOnlyPositive() throws Exception {
        System.out.println("calculateNumbersSumOnlyPositive");
        //GIVEN
        List<Integer> input = Arrays.asList(1,2,3, - 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        boolean onlyPositive = true;
        int expectedOutput = 6;
        
        //WHEN 
        Calculator calculator = new Calculator();
        int actualOutput = calculator.calculateNumbersSum(input, onlyPositive);
        //THEN
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void calculateNumbersSumOnlyNegative() throws Exception {
        System.out.println("calculateNumbersSumOnlyNegatives");
        //GIVEN
        List<Integer> input = Arrays.asList(1,2,3, - 1);
        boolean onlyPositive = false;
        int expectedOutput =  -1;
        
        //WHEN 
        Calculator calculator = new Calculator();
        int actualOutput = calculator.calculateNumbersSum(input, onlyPositive);
        //THEN
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}
