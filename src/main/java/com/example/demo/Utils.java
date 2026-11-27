package com.example.demo;

import java.util.Locale;

public class Utils {

    public static int add(int a, int b) {
        return a + b;
    }

    public static String formatProductInfo(String name, double price) {
        return String.format(Locale.ROOT, "Item: %s, Cost: %.2f", name, price);
    }
}
