package ru.academits.java.aleksandrov;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите последнее число: ");
        int lastNumber = scanner.nextInt();

        int numbersCount = 0;
        int numbersSum = 0;
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            numbersSum += i;
            numbersCount++;
        }

        double numbersArithmeticAverage = (double) numbersSum / numbersCount;
        double evenNumbersArithmeticAverage = (double) evenNumbersSum / evenNumbersCount;

        System.out.println("Среднее арифметическое чисел равно: " + numbersArithmeticAverage);
        System.out.println("Среднее арифметическое четных чисел равно: " + evenNumbersArithmeticAverage);
    }
}