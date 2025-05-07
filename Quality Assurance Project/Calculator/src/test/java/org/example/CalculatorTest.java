package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void twoPlusTwoShouldEqualFour(){
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void threePlusFiveShouldEqualEight(){
        assertEquals(8,calculator.add(3,5));
    }

    @Test
    void oneBillionPlusOneBillionShouldEqualTwoBillion(){
        assertEquals(2000000000,calculator.add(1000000000,1000000000));
    }

    @Test
    void negativeTenPlusNegativeNineShouldEqualNegativeNineteen(){
        assertEquals(-19,calculator.add(-10,-9));
    }

    @Test
    void twoMinusTwoShouldEqualZero(){
        assertEquals(0,calculator.sub(2,2));
    }

    @Test
    void oneMinusTwelveShouldEqualNegativeEleven(){
        assertEquals(-11,calculator.sub(1,12));
    }

    @Test
    void zeroMinusTenBillionShouldEqualNegativeTenBillion(){
        assertEquals(-1000000000,calculator.sub(0,1000000000));
    }

    @Test
    void zeroMinusZeroShouldEqualZero(){
        assertEquals(0,calculator.sub(0,0));
    }

    @Test
    void tenMinusNegativeFiveThousandShouldEqualFiveThousandTen(){
        assertEquals(5010,calculator.sub(10,-5000));
    }

    @Test
    void tenTimesTenShouldEqualOneHundred(){
        assertEquals(100,calculator.mult(10,10));
    }

    @Test
    void zeroTimesOneThousandShouldEqualZero(){
        assertEquals(0,calculator.mult(0,1000));
    }

    @Test
    void FiveThousandTimesZeroShouldEqualZero(){
        assertEquals(0,calculator.mult(5000,0));
    }

    @Test
    void oneTimesTwentyFiveShouldEqualTwentyFive(){
        assertEquals(25,calculator.mult(1,25));
    }

    @Test
    void fiveTimesThirtySixShouldEqualOneHundredEighty(){
        assertEquals(180,calculator.mult(5,36));
    }

    @Test
    void thirtySixTimesFiveShouldEqualOneHundredEighty(){
        assertEquals(180,calculator.mult(36,5));
    }

    @Test
    void negativeFiveTimesFourShouldEqualNegativeTwenty(){
        assertEquals(-20,calculator.mult(-5,4));
    }

    @Test
    void elevenTimesNegativeFourShouldEqualNegativeFortyFour(){
        assertEquals(-44,calculator.mult(11,-4));
    }

    @Test
    void tenDividedByTwoShouldEqualFive(){
        assertEquals(5,calculator.div(10,2));
    }

    @Test
    void zeroDividedByFiftyShouldEqualZero(){
        assertEquals(0,calculator.div(0,50));
    }

    @Test
    void oneHundredDividedByZeroShouldEqualZero(){
        assertEquals(0,calculator.div(100,0));
    }

    @Test
    void thirtySevenDividedByOneShouldEqualThirtySeven(){
        assertEquals(37,calculator.div(37,1));
    }

    @Test
    void pointFiveDividedByPointTwoShouldEqualTwoPointFive(){
        assertEquals(2.5,calculator.div((float)0.5,(float)0.2));
    }

    @Test
    void negativeTenDividedByPointTwoShouldEqualNegativeFifty(){
        assertEquals(-50,calculator.div((float)-10,(float)0.2));
    }

    @Test
    void negativeTwelveDividedByNegativeFourShouldEqualThree(){
        assertEquals(3,calculator.div(-12,-4));
    }

}