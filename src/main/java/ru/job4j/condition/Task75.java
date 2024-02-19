package ru.job4j.condition;

public class Task75 {
    public static int innerNum(int num2, int num4) {
        int a = num4 / 1000;
        num4 %= 1000;
        int b = num4 / 100;
        num4 %= 100;
        int c = num4 / 10;
        int d = num4 % 10;
        int r = 0;

        if (a * 10 + b == num2) {
             r += 1;
        }
        if (b * 10 + c == num2) {
            r += 1;
        }

        if (c * 10 + d == num2) {
            r += 1;
        }

        return r;
    }

    public static void main(String[] args) {
    int result = Task75.innerNum(33, 3073);
        System.out.println(result);
    }
}
