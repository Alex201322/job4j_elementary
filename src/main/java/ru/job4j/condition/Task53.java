package ru.job4j.condition;

public class Task53 {
    public static void transformFraction(int numerator, int denominator) {
        if (Math.abs(numerator) >= Math.abs(denominator) || numerator == denominator) {
            int wholePart = numerator / denominator;
            int remainder = Math.abs(numerator) % Math.abs(denominator);

            if (remainder == 0) {
                System.out.println(wholePart);
            } else {
                System.out.println(wholePart + " " + remainder + "/" + Math.abs(denominator));
            }
        } else {
            System.out.println("Подсчет не производится");
        }
    }

    public static void main(String[] args) {
        Task53.transformFraction(8, 7);
    }
}
