package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row; /* Check for left diagonal */
                boolean right = cell == size - 1 - row; /* Check for right diagonal */
                if (left || right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw Slash by 3");
        draw(3);
        System.out.println("Draw Slash by 7");
        draw(7);
    }
}
