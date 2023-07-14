//tema restul operatiilor cel putin 2 pt fiecare operatie 10 meth
//posibile scenarii care nu fct cum trebuie
//nr negative

package Homework.Homework06;

import Homework.Homework06.Calculator;
import org.junit.*;

public class CalculatorTestClass {

    static double totalSum = 0;
    double result = 1;
    Homework.Homework06.Calculator calculator = new Calculator();

    @Before
    public void resetResult() {
        result = 0;
    }

    @After
    public void calculateTotalSum() {
        totalSum += result;
    }

    @AfterClass()
    public static void printTotalSum() {
        System.out.println("Total sum is: " + totalSum);
    }

    //ADDITION
    //Simple addition
    //Opposite numbers Addition
    //Addition with domain exceeding, without and with errors
    @Test()
    public void testAddition() {
        System.out.println("Test addition ");
        System.out.println("Initial result: " + result);
        result = calculator.compute(100, 25, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(125, result, 0);
    }
    @Test()
    public void testAdditionOppositeNumbers() {
        System.out.println("Test addition of opposite numbers");
        System.out.println("Initial result: " + result);
        result = calculator.compute(-30, 30, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdditionExceedDomainWithoutFail() {
        System.out.println("Test exceeding domain limit" + Double.MAX_VALUE + "by addition, without fail");
        System.out.println("Initial result: " + result);
        result = calculator.compute(Double.MAX_VALUE, 30, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }

    @Test()
    public void testAdditionExceedDomainWithFail() {
        System.out.println("Test exceeding domain limit" + Double.MAX_VALUE + "by addition, with fail");
        System.out.println("Initial result: " + result);
        result = calculator.compute(100, Double.MAX_VALUE, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    //SUBSTRACTION
    //simple substraction
    //equal numbers substraction

    @Test()
    public void testSubtraction() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(20, 1, "-");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(19, result, 0);
    }
    @Test()
    public void testSubtractionOfEqualNumbers() {
        System.out.println("Test difference of equal numbers");
        System.out.println("Initial result: " + result);
        result = calculator.compute(-20, -20, "-");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    //MULTIPLY
    //simple multiply
    //multiply by 1
    //multiply by 0
    //multiply with exceeding domain, without and with fail

    @Test()
    public void testMultiply() {
        System.out.println("Test multiplication of two numbers");
        System.out.println("Initial result: " + result);
        result = calculator.compute(11, 12, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(132, result, 0);
    }

    @Test()
    public void testMultiplyByOne() {
        System.out.println("Test multiplication by 1");
        System.out.println("Initial result: " + result);
        result = calculator.compute(259, 1, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(259, result, 0);
    }
    @Test()
    public void testMultiplyByZero() {
        System.out.println("Test multiplication by 0");
        System.out.println("Initial result: " + result);
        result = calculator.compute(11, 0, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplicationExceedDomainWithoutFail() {
        System.out.println("Test exceeding domain limit" + Double.MAX_VALUE + "by multiplication, without fail");
        System.out.println("Initial result: " + result);
        result = calculator.compute(Double.MAX_VALUE, 30, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }

    @Test()
    public void testMultiplicationExceedDomainWithFail() {
        System.out.println("Test exceeding domain limit" + Double.MAX_VALUE + " by multiplication, with fail");
        System.out.println("Initial result: " + result);
        result = calculator.compute(100, Double.MAX_VALUE, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    //DIVIDE
    //simple division
    //divide by 0 without and with fail
    //divide by 1
    @Test()
    public void testDivide() {
        System.out.println("Test divide");
        System.out.println("Initial result: " + result);
        result = calculator.compute(33, 3, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(11, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroWithoutFail() {
        System.out.println("Test divide by 0 without fail");
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(50, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }

    @Test()
    public void testDivideByZeroWithFail() {
        System.out.println("Test divide by 0 with fail");
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(50, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }

    //SQUARE ROOT
    //positive numbers square root
    //0 square root
    //negative numbers square root with and without fail
    @Test()
    public void testSquareRoot() {
        System.out.println("Test square root");
        System.out.println("Initial result: " + result);
        result = calculator.compute(64, 2, "SQRT");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(8, result, 0);
    }
    @Test()
    public void testZeroSquareRoot() {
        System.out.println("Test 0 square root");
        System.out.println("Initial result: " + result);
        result = calculator.compute(0, 2, "SQRT");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootFromNegativeWithoutFail() {
        System.out.println("Test square root from negative number");
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot calculate square root from negative");
        result = calculator.compute(-64, 2, "SQRT");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(8, result, 0);
    }

    @Test()
    public void testSquareRootFromNegativeWithFail() {
        System.out.println("Test square root from negative number");
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot calculate square root from negative");
        result = calculator.compute(-64, 2, "SQRT");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(8, result, 0);
    }

    //ILLEGAL OPERATOR without and with fail
    @Test(expected = IllegalArgumentException.class)
    public void testUnsupportedOperatorWithoutFail() {
        System.out.println("Test unsupported operator");
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because operator is unknown");
        result = calculator.compute(-64, 2, "&");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(300, result, 0);
    }
    @Test()
    public void testUnsupportedOperatorWithFail() {
        System.out.println("Test unsupported operator");
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because operator is unknown");
        result = calculator.compute(-64, 2, "&");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(300, result, 0);
    }

}