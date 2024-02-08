package ru.job4j.condition;

public class Task66 {
    public static void daytime(int number) {
        if (number < 0 || number > 23) {
            System.out.println("Не является часом");
        }
        if (number >= 6 && number <= 10) {
            System.out.println("Утро");
        }
        if (number >= 11 && number <= 17) {
            System.out.println("День");
        }
        if (number >= 18 && number <= 22) {
            System.out.println("Вечер");
        }
        if (number > -1 && number <= 5 || (number == 23)) {
            System.out.println("Ночь");
        }
    }

    public static void main(String[] args) {
        Task66.daytime(5);
    }
}
