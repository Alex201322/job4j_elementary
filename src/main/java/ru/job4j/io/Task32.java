package ru.job4j.io;

public class Task32 {
    public static int evenAmount(int number) {
        int num1, counter1 = 0;
        num1 = number / 10;
        if (num1 % 2 == 0) {
            counter1++;
        }
        return counter1;
    }

    public static int evenAmount2(int number) {
        int  num2, counter = 0;
        num2 = number % 10;
        if (num2 % 2 == 0) {
             counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int number = 66;
        int result1 = Task32.evenAmount(number);
        int result2 = Task32.evenAmount2(number);
        System.out.println(result1 + "" + result2);

    }
}