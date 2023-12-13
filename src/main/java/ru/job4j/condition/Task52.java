package ru.job4j.condition;

public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        double res1 = (double) a1 / a2;
        double res2 =  (double) b1 / b2;

        if (res1 == res2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 3;
        int b1 = 5;
        int b2 = 6;
        Task52.isEquals(a1, a2, b1, b2);
    }
}
