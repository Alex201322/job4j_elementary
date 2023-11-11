package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 176;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.printf("Man height: %d man: %.3f  \n", height, man);
        System.out.printf("Woman height: %d woman: %.3f  \n", height, woman);
    }

}