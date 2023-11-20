package ru.job4j.condition;

public class ChessBoard2 {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1); // Math.abs(y2 - y1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int x1 = 6, y1 = 7, x2 = 1, y2 = 2;
        int rrr = ChessBoard2.way(x1, y1, x2, y2);
        System.out.println(rrr);
    }
}