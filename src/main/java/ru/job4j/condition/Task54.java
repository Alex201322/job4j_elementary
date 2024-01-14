package ru.job4j.condition;

public class Task54 {

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:NeedBraces"})
    public static void transform(int number) {

        int units = number % 10;
        int modifiedunits = units;

        int tens = number / 10 % 10;
        int modifiedtens = tens;

        int hundreds = number / 100;
        int modifiedhundreds = hundreds;

        if (number >= 0 && number % 2 == 0) {
            if (units % 2 == 0) {
                modifiedunits = units + 1;
            }
        }
        if (number < 0 && number % 2 == 0) {
            if (units % 2 == 0) {
                modifiedunits = units - 1;
            }

        }
        if (number > 0 && number % 2 != 0) {
            if (units % 2 != 0 && units != 9) {
                modifiedunits = units + 1;
            }
            if (units == 9) {
            modifiedunits = units;
            }
        }
        if (number < 0 && number % 2 != 0) {
            if (units % 2 != 0) {
                modifiedunits = units - 1;
            }
            if (units == -9) {
                modifiedunits = units;
            }
        }
        //System.out.println(modifiedunits); // final

        if (number > 0 && number % 2 == 0) {
            if (tens % 2 == 0) {
                modifiedtens = tens + 1;
            }
            if (tens % 2 != 0) {
                modifiedtens = tens - 1;
            }
        }
        if (number < 0 && number % 2 == 0) {
            if (tens % 2 == 0) {
                modifiedtens = tens - 1;
            }
        }
        if (number > 0 && number % 2 != 0) {
            if (tens % 2 == 0 && tens != 0) {
                modifiedtens = tens - 1;
                if (tens == 0) {
                    modifiedtens = tens;
                }
            }
            if (tens % 2 != 0 && tens != 9) {
                modifiedtens = tens + 1;
            }
            //System.out.println(modifiedtens);
        }
        if (number < 0 && number % 2 != 0) {
            if (tens % 2 == 0 && tens != 0) {
                modifiedtens = tens + 1;
                if (tens == 0) {
                    modifiedtens = tens;
                }
            }
            if (tens % 2 != 0 && tens != -9) {
                modifiedtens = tens - 1;
            }
            if (tens == -9) {
                modifiedtens = tens;
            }
            //System.out.println(modifiedtens);  // final
        }
        if (number % 2 == 0 && number > 0) {
            if (hundreds % 2 == 0) {
                modifiedhundreds = hundreds + 1;
            }
            if (hundreds % 2 != 0) {
                modifiedhundreds = hundreds - 1;
            }
            System.out.println(modifiedhundreds);
        }
        if (number % 2 == 0 && number < 0) {
            if (hundreds % 2 == 0) {
                modifiedhundreds = hundreds - 1;
            }
            if (hundreds % 2 != 0) {
                modifiedhundreds = hundreds + 1;
            }
            //System.out.println(modifiedhundreds);
        }
        if (number % 2 != 0 && number > 0) {
            if (hundreds % 2 == 0) {
                modifiedhundreds = hundreds - 1;
            }
            if (hundreds % 2 != 0 && hundreds != 9) {
                modifiedhundreds = hundreds + 1;
            }
            if (hundreds == 9) {
                modifiedtens = hundreds;
            }
            //System.out.println(modifiedhundreds);
        }
        if (number % 2 != 0 && number < 0) {
            if (hundreds % 2 != 0 && hundreds != 9) {
                modifiedhundreds = hundreds - 1;
            }
            //System.out.println(modifiedhundreds);
        }
        System.out.println(modifiedhundreds * 100 + modifiedtens * 10 + modifiedunits);
    }

    public static void main(String[] args) {
        Task54.transform(100);

    }
}
