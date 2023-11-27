package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int d = 2; d <= n; d++) {
                result *= d;
            }
            return result;
        }

    }

    public static void main(String[] args) {
        System.out.println(calc(0));
    }
}