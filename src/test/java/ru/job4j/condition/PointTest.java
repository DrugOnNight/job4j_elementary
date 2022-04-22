package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to34then3dot6() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 4);
        double expected = 3.6;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to40then4() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to222then4() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(10, 10, 5);
        double expected = 15;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}