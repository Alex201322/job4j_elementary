package ru.job4j.condition;

public class Task59 {
    public static void getLinearEquation(int a, int b) {
        double x;

        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        }
        if (a == 0 && b != 0 || a != 0 && b == 0) {
            System.out.println("Нет решения");
        }
        if (a != 0 && b != 0) {
            x = (double) -b / a;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Task59.getLinearEquation(8, 0);
    }
}
