package ru.job4j.condition;

public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        if (a >= b + c || b >= a + c || c >= b + a) {
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }

    public static void main(String[] args) {
     Task56.isTriangle(40, 42, 750);
    }
}
