package ru.academits.java.aleksandrov;

public class ArithmeticAverage {
    public static void main(String[] args) {
        int firstNumber = 3;
        int lastNumber = 17;

        int numbersCount = 0;
        int numbersSum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            numbersSum += i;
            numbersCount++;
        }

        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        for (int j = firstNumber; j <= lastNumber; j++) {
            if (j % 2 == 0) {
                evenNumbersSum += j;
                evenNumbersCount++;
            }
        }

        double numbersArithmeticAverage = (double) numbersSum / numbersCount;
        double evenNumbersArithmeticAverage = (double) evenNumbersSum / evenNumbersCount;

        System.out.println("Среднее арифметическое чисел равно: " + numbersArithmeticAverage);
        System.out.println("Среднее арифметическое четных чисел равно: " + evenNumbersArithmeticAverage);
    }
}