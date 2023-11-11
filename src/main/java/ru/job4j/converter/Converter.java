package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(double value) {
         return value / 499.05;
    }

    public static double rubleToDollar(double value) {
         return  value / 468.10;
    }

    public static void main(String[] args) {

        double euro = Converter.rubleToEuro(2000);
        double dollar = Converter.rubleToDollar(1001);
        double sum1 = euro * 499.05;
        double sum2 = dollar * 468.10;
        System.out.printf("tenge: %.3f euro: %.3f  \n", sum1, euro);
        System.out.printf("tenge: %.3f dollar: %.3f  \n", sum2, dollar);
    }
}
