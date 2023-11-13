package ru.job4j.converter;

public class Converter {
    public static double tengeToEuro(double value) {
         return value / 499.05;
    }

    public static double tengeToDollar(double value) {
         return  value / 468.10;
    }

    public static void main(String[] args) {
        double e = 40000.05;
        double d = 9000000000000.99;
        double euro = Converter.tengeToEuro(e);
        double dollar = Converter.tengeToDollar(d);
        double sum1 = Math.floor(Math.round(euro * 499.05 * 100)) / 100;
        double sum2 = Math.floor(Math.round(dollar * 468.10 * 100)) / 100;
        System.out.println(sum1 + "  " + e);
        System.out.println(sum2 + "  " + d);
        boolean passed1 = sum1 == e;
        boolean passed2 = sum2 == d;
        System.out.printf("Tenge: %.2f euro: %.2f test: %s \n", sum1, euro,  passed1);
        System.out.printf("Tenge: %.2f dollar: %.2f test: %s \n", sum2, dollar, passed2);
    }
}
