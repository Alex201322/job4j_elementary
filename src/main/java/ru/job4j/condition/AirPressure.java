package ru.job4j.condition;

public class AirPressure {
    public static void main(String[] args) {
        inputMeasurement(1);
        inputMeasurement(-2);
    }

    public static void inputMeasurement(int number) {
        if (number == 0) {
            System.out.println("No job.");
        }

        if (number < 0) {
            System.out.println("Negative meaning");
        }

        if (number > 0) {
            System.out.println("Job");
        }
    }
}
