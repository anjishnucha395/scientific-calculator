package com.anjishnu;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {
    @Test
    public void TwentyFiveSquareRootIsFive() {
        System.out.println("Checking TwentyFiveSquareRootIsFive\n");
        Calculator calculator = new Calculator();
        assertEquals("Failure - sqrt(25) is not equal to 5. ",calculator.squareRoot(25),5f,0.009);
    }

    @Test
    public void MinusOneSquareRootIsNaN() {
        System.out.println("Checking MinusOneSquareRootIsNaN\n");
        Calculator calculator = new Calculator();
        assertEquals("Failure - sqrt(-1) is not equal to NaN. ",calculator.squareRoot(-1),Double.NaN,0.009);
    }

    @Test
    public void fourFactorialIsNotSix() {
        System.out.println("Checking fourFactorialIsNotSix\n");
        Calculator calculator = new Calculator();
        assertNotEquals("Error - Fact(4) evaluated to be six. ",calculator.factorial(4),6);
    }

    @Test
    public void fiveFactorialIsSevenTwenty() {
        System.out.println("Checking fiveFactorialIsHundredTwenty\n");
        Calculator calculator = new Calculator();
        assertEquals("Error - Fact(5) != 120. ",calculator.factorial(5),120);
    }

    @Test
    public void naturalLogOfOneIsZero() {
        System.out.println("Checking naturalLogOfOneIsZero\n");
        Calculator calculator = new Calculator();
        assertEquals("Error - ln(1) != 0. ",calculator.naturalLog(1f),0f,0.009);
    }

    @Test
    public void naturalLogOfZeroIsNotOne() {
        System.out.println("Checking naturalLogOfZeroIsNotOne\n");
        Calculator calculator = new Calculator();
        assertNotEquals("Error - ln(0) = 1. ",calculator.naturalLog(0f),1f,0.009);
    }

    @Test
    public void threePowerTwoIsNine() {
        System.out.println("Checking threePowerTwoIsNine\n");
        Calculator calculator = new Calculator();
        assertNotEquals("3 ^ 2 = 9. Not 8 ",calculator.power(3f, 2f),8f,0.009);
    }

    @Test
    public void tenPowerMinusOneIsNotTen() {
        System.out.println("Checking tenPowerMinusOneIsNotTen\n");
        Calculator calculator = new Calculator();
        assertNotEquals("Error - 10 ^ -1 evaluates to be 10. ",calculator.power(10f,-1f),10f,0.009);
    }
}
