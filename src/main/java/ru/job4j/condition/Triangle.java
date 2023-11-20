package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac;
    }

        public static void main(String[] args) {
            double ab = 1.5, bc = 2.7, ac = 3.4;
            System.out.println(exist(ab, ac, bc));
        }
}
