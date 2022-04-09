package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenFriday() {
        String in = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSunday() {
        String in = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when8weExpectMinus1() {
        String in = "Four";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}