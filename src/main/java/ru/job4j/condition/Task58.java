package ru.job4j.condition;

public class Task58 {
    public static void isWinning(int number) {
        int a = number / 100000;
        int b = (number - a * 100000) / 10000;
        int c = (number - (a * 100000 + b * 10000)) / 1000;
        int d = (number - a * 100000 - b * 10000 - c * 1000) / 100;
        int e = (number - a * 100000 - b * 10000 - c * 1000 - d * 100) / 10;
        int f = number % 10;
        int g = a + b + c;
        int h = d + e + f;
        if (g == h && g % 2 == 0 && h % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }

    public static void main(String[] args) {
        Task58.isWinning(122222);
    }
}
