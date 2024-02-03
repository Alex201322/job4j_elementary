package ru.job4j.condition;

public class Task62 {

    public static void isRising(int number) {
        int a = number / 100;
        int b = (number - a * 100) / 10;
        int c = number % 10;

        if (a < b && b < c) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        Task62.isRising(355);
    }
}


