package ru.academits.java.aleksandrov;

public class ForCycle {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            if (checkDivisibilityBy4(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkDivisibilityBy4(int number) {
        return number % 4 == 0;
    }
}