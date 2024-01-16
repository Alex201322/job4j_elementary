package ru.job4j.condition;

public class Task55 {
    public static void apartmentPlace(int number) {
        int floor = (number - 1) / 3 + 1;
        int position = (number - 1) % 3 + 1;
        System.out.println(floor);
        System.out.println(position);
    }

    public static void main(String[] args) {
        Task55.apartmentPlace(13);
    }
}
