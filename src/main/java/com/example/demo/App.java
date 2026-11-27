package com.example.demo;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Sum: " + Utils.add(5, 3));
        System.out.println(Utils.formatProductInfo("Notebook", 3500.0));
    }

    public String formatProductInfo(String name, double price) {
        return Utils.formatProductInfo(name, price);
    }
}
