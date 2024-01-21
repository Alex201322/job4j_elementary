package ru.job4j.condition;

public class Task57 {
    @SuppressWarnings({"checkstyle:AvoidNestedBlocks", "checkstyle:EmptyStatement", "checkstyle:LeftCurly"})
    public static void triangleType(int a, int b) {
        if (a <= 0 || b <= 0 || a + b >= 180) {
            System.out.println("Ошибка");
            return;
        }
        int c = 180 - (a + b);
        StringBuilder result = new StringBuilder();
        if (a < 90 && b < 90 && c < 90) {
            result.append("Остроугольный ");
        }
        if (a == 90 || b == 90 || c == 90) {
            result.append("Прямоугольный ");
        }
        if (a > 90 || b > 90 || c > 90) {
            result.append("Тупоугольный ");
        }
        if (a == b || b == c || a == c) {
            result.append("Равнобедренный ");
        }
        if (a == 60 && b == 60 && c == 60) {
            result.append("Равносторонний ");
        }
        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        Task57.triangleType(50, 50);

    }
}
