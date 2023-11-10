package ru.job4j.calculator;

public class Calculator {
    public static void plus(int width, int length) {
        int square = width * length;
        System.out.println(square);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);

        System.out.println(sixDivTwo);
        System.out.println(onePlusTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }

}