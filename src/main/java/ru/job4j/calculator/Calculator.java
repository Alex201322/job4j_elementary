package ru.job4j.calculator;

public class Calculator {
    public static void plus(int width, int length) {
        int square = width * length;
        System.out.println(square);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);

    }

}