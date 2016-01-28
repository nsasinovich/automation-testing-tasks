package com.mycompany.calculator;

import org.junit.*;

public class AppTest {

    @Test
    public void testApp() {
        Assert.assertTrue(true);
    }

    @Test
    public void additionTest() {
        String actual = App.calculate("-20", "+", "0.1");
        Assert.assertEquals("-19.9", actual);
    }

    @Test
    public void subtractionTest() {
        String actual = App.calculate("-2.2", "-", "-0.2");
        Assert.assertEquals("-2.0", actual);
    }

    @Test
    public void multiplicationTest() {
        String actual = App.calculate("-20", "*", "0.2");
        Assert.assertEquals("-4.0", actual);
    }

    @Test
    public void divisionTest() {
        String actual = App.calculate("-20", "/", "0.1");
        Assert.assertEquals("-200.0", actual);
    }

    @Test
    public void divisionByZeroTest() {
        String actual = App.calculate("-2", "/", "0.0");
        Assert.assertEquals("-Infinity", actual);
    }

    @Test
    public void divisionZeroByZeroTest() {
        String actual = App.calculate("0.0", "/", "0.0");
        Assert.assertEquals("NaN", actual);
    }

    @Test
    public void unknownOperatorTest() {
        String actual = App.calculate("5", "#", "5");
        Assert.assertEquals("Unknown operation!", actual);
    }

    @Test
    public void manyArgumentsTest() {
        String actual = App.calculate("5", "#", "5", "+");
        Assert.assertEquals("Invalid number of arguments!", actual);
    }

    @Test
    public void fewArgumentsTest() {
        String actual = App.calculate("5", "#");
        Assert.assertEquals("Invalid number of arguments!", actual);
    }
}
