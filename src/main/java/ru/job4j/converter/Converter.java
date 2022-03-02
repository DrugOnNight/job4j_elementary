package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float usd = Converter.rubleToDollar(180);
        System.out.println("180 ruble are " + usd + " dollars.");
        float rubles = Converter.euroToRuble(5);
        System.out.println("5 euro are " + rubles + " rubles.");
        rubles = Converter.dollarToRuble(10);
        System.out.println("10 dollars are " + rubles + " rubles.");
    }
}