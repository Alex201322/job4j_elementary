package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        double a = 8, b = 9, c = 9;
        double s = TrgArea.area(a, b, c);
        System.out.printf("Area of a triangle = %.2f \n ", s);
    }
}
