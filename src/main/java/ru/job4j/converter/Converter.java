package ru.job4j.converter;

public class Converter {
    static double kursEuro = 500.10;
    static double kursDollar = 458.23;

    public static double tengeToEuro(double value) {
        return value / kursEuro;
    }

    public static double tengeToDollar(double value) {
         return  value / kursDollar;
    }

    public static void main(String[] args) {
        double e = 2000;
        double d = 2000;
        double euro = Converter.tengeToEuro(e);
        double dollar = Converter.tengeToDollar(d);
        double sum1 = Math.floor(Math.round(euro * kursEuro * 100)) / 100;
        double sum2 = Math.floor(Math.round(dollar * kursDollar * 100)) / 100;
        System.out.println(sum1 + "  " + e);
        System.out.println(sum2 + "  " + d);
        boolean passed1 = sum1 == e;
        boolean passed2 = sum2 == d;
        System.out.printf("Tenge: %.0f euro: %.3f test: %s \n", sum1, euro,  passed1);
        System.out.printf("Tenge: %.0f dollar: %.3f test: %s \n", sum2, dollar, passed2);

        }
    }


