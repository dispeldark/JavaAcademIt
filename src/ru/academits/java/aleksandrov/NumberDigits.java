package ru.academits.java.aleksandrov;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int numberModulus = Math.abs(scanner.nextInt());

        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        for (int i = numberModulus; i != 0; i /= 10) {
            int digit = i % 10;
            digitsSum += digit;

            if (digit % 2 == 1) {
                oddDigitsSum += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }

        System.out.println("Сумма цифр равна: " + digitsSum);
        System.out.println("Сумма нечетных цифр равна: " + oddDigitsSum);
        System.out.println("Максимальная цифра числа: " + maxDigit);
    }
}