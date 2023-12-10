package ru.job4j.condition;

public class Task45 {
    @SuppressWarnings({"checkstyle:NoWhitespaceBefore", "checkstyle:InnerAssignment"})
    public static void changeToRoundNum(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        boolean sum1 = num2 != 0 && num2 >= 5 && num3 != 0;

        boolean sum2 = num2 == 0 || num2 < 5 && num3 != 0 || num3 > 5;

        boolean sum3 = num3 == 0;

        int result1 = (num2 + 1) * 10;

        int result3 = num1 * 100 + result1;
        int result4 = (num1 * 100) + (num2 * 10);

        if (sum1) {
            System.out.printf("Увеличено до %d%n", result3);
        } else if (sum2) {
            System.out.printf("Уменьшено до %d%n", result4);
        } else if (sum3) {
            System.out.println("Без изменений");
        }

    }

    public static void main(String[] args) {
        int number = 56;
        Task45.changeToRoundNum(number);
    }
}
