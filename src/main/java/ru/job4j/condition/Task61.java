package ru.job4j.condition;

public class Task61 {
    public static void hasEqualDigits(int number) {
        int a = number / 100;
        System.out.println(a);
        int b = (number - a * 100) / 10;
        System.out.println(b);
        int c = number % 10;
        System.out.println(c);
        if (a == b && b == c) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        Task61.hasEqualDigits(333);
    }
}
