package ru.job4j.io;

public class Task15 {
    public static void main(String[] args) {
        String source = "+!?";

        char firstChar = source.charAt(0);
        char secondChar = source.charAt(1);
        char thirdChar = source.charAt(2);

        System.out.print("" + firstChar + firstChar + firstChar);
        System.out.print("" + secondChar + secondChar + secondChar + secondChar);
        System.out.print("" + thirdChar + thirdChar);
    }
}
