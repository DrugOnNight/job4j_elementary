package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int result = max(first, second);
        return max(result, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int max1 = max(first, second);
        int max2 = max(third, fourth);
        return max(max1, max2);
    }
}