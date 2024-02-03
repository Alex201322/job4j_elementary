package ru.job4j.condition;

public class Task65 {
    @SuppressWarnings("checkstyle:EmptyBlock")
    public static void season(int number) {
        if (number > 2 && number < 6) {
            System.out.println("Весна");
        }
        if (number > 5 && number < 9) {
            System.out.println("Лето");
        }
       if (number > 8 && number < 12) {
            System.out.println("Осень");
        }
        if (number == 12 || number == 2 || number == 1) {
            System.out.println("Зима");
        }
        if (number <= 0 || number > 12) {
            System.out.println("Не является месяцем");
        }
    }

    public static void main(String[] args) {
        Task65.season(23);
    }
}
