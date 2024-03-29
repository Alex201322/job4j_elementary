package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
        }

    public static void main(String[] args) {
        int x1 = 5, y1 = 45, x2 = 12, y2 = 7;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.printf("Point1 (%d,%d), Point2 (%d,%d) \n distance = %.2f \n ", x1, y1, x2, y2, result);
    }
}
