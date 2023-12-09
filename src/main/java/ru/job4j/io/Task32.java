package ru.job4j.io;

public class Task32 {

    public static int evenAmount(int number) {
        int  num1, num2, num3, counter = 0;
        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;
        if (num1 % 2 == 0) {
            counter++;
        }
        if (num2 % 2 == 0) {
            counter++;
        }
        if (num3 % 2 == 0) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int number = 624;
        int counter = Task32.evenAmount(number);
        System.out.println(counter);
    }
}