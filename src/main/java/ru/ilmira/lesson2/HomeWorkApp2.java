package ru.ilmira.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSumOfNumbers(30, 2));
        checkNegativeNumber(7);
        System.out.println(checkNumber(-5));
        printNumber("Привет", 3);
        System.out.println(isLeapYear(2020)); // Високосный год
        System.out.println(isLeapYear(2021)); // Не високосный год
    }

    public static boolean checkSumOfNumbers(int a, int b) {
        int result = a + b;
        return result >= 10 && result <= 20;
    }

    public static void checkNegativeNumber(int a) {
        System.out.println(a >= 0 ? "Вы передали положительное число" : "Вы передали отрицательное число");
    }

    public static boolean checkNumber(int b) {
        // про ноль в задании не написали, поэтому  я посчитала, что это положительное число
        return b < 0;
    }

    public static void printNumber(String s, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(s);
        }
    }

    public static boolean isLeapYear(int year) {
        boolean result = (year % 400 == 0 && year % 100 == 0) || (year % 4 == 0 && year % 100 > 0);
        return result;
    }
}

