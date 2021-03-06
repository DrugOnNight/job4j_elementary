package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[]{5, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5elements2() {
        int[] data = new int[]{6, 4, 7, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 4, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }
}