package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenEvenCountOfElements() {
        int[] in = new int[]{1, 2, 3, 4, 5};
        int[] result = Turn.back(in);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenOddCountOfElements() {
        int[] in = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = Turn.back(in);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }
}