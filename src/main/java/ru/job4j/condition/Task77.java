package ru.job4j.condition;

public class Task77 {
    public static void diffNumAmount(int num) {
        int a = num / 100;
        num %= 100;
        int b = num / 10;
        int c = num % 10;
        if (a != b && b != c) {
            System.out.println("3");
        }
        if (a == b && b == c) {
            System.out.println("0");
        }
        if (a == b && a != c || b == c && b != a) {
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        Task77.diffNumAmount(555);
    }
}
