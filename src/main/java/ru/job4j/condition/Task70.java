package ru.job4j.condition;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        if (seconds > 3600) {
            System.out.println("Расчет не производится");
        } else {
            int x = seconds / 60;
            int y = seconds % 60;
            System.out.println("Минут: " + x + ", секунд: " + y);
        }
    }

    public static void main(String[] args) {
        Task70.secondsToMinutes(366);
    }

}