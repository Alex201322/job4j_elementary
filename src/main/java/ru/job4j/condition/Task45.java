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
        int result2 = num3 - num3;

        int result3 = num1 * 100 + result1 + result2;
        int result4 = (num1 * 100) + (num2 * 10) + result2;

        if (sum1) {
            System.out.println("Увеличено до" + " " + result3);
        } else if (sum2) {
            System.out.println("Уменьшено до" + " " + result4);
        } else if (sum3) {
            System.out.println("Без изменений");
        }

    }

    public static void main(String[] args) {
        int number = 44;
        Task45.changeToRoundNum(number);
    }
}
