package ru.job4j.condition;

public class Task71 {
    public static void change(int money) {
        int x = money / 100;
        money %= 100;
        int y = money / 50;
        money %= 50;
        int z = money / 10;

        if (money % 10 == 0) {
            System.out.println("100: " + x + ", " + "50: " + y + ", " + "10: " + z);
        } else {
            System.out.println("Нельзя");
        }

    }

    public static void main(String[] args) {
        Task71.change(340);
    }
}
