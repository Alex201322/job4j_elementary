package ru.job4j.condition;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            System.out.println("Все равны");
        }
        if (a != b && b != c && c != a) {
            System.out.println("Равных нет");
        }
        if (a == b && c > a) {
            System.out.println("Первое и второе равны, третье больше");
        }
        if (a == c && b > a) {
            System.out.println("Первое и третье равны, второе больше");
        }
        if (b == c && a > b) {
            System.out.println("Второе и третье равны, первое больше");
        }
        if (a == c && b < a) {
            System.out.println("Первое и третье равны, второе меньше");
        }
        if (b == c && a < b) {
            System.out.println("Второе и третье равны, первое меньше");
        }
        if (a == b && c < b) {
            System.out.println("Первое и второе равны, третье меньше");
        }
    }

    public static void main(String[] args) {
    Task60.numRelation(2, 4, 4);
    }
}
