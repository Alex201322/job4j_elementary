package ru.job4j.condition;

public class PairsCharString {
    @SuppressWarnings("checkstyle:OperatorWrap")
    public static boolean check(String l, String r) {

        if (l.isEmpty() && r.isEmpty()) {
            return true;
        }
        if (!l.isEmpty() && !r.isEmpty() && l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String l = "";
        String r = "";
        boolean result = check(l, r);
        System.out.println(result);

    }
}
