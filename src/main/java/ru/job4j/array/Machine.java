package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        price = money - price;
        for (int coin : coins) {
            while (price >= coin) {
                price -= coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}