package ru.job4j.condition;

public class Task68 {
    public static void isTriangle(int a, int b, int c) {
            if (a + b <= c || b + c <= a || a + c <= b) {
                System.out.println("Нет");
            } else {
                System.out.println("Да");
            }
    }

    public static void main(String[] args) {
    Task68.isTriangle(3, 5, 7);
    }
}
