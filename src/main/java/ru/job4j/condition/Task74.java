package ru.job4j.condition;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        int a = num4 / 1000;
        num4 %= 1000;
        int b = num4 / 100;
        num4 %= 100;
        int c = num4 / 10;
        int d = num4 % 10;

        if (a * 10 + b == num2 || b * 10 + c == num2 || c * 10 + d == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        Task74.innerNum(34, 3655);

    }
}
