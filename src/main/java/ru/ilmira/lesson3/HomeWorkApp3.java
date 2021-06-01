package ru.ilmira.lesson3;

import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {
         invertArray();
         fillArray();
         fillArray2();
         fillDiagonal();
         getArray(5, 3);
         findMinMax();
         System.out.println(checkBalance(new int[]{2, 2, 2, 3, 3}));
         printArray(shiftArray(new int[]{1, 8, 4, 5}, 2));

    }

    private static void printArray(int[] array) { // метод для вывода массива
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printArray(int[][] array) { // метод для вывода двумерного массива
        for (int[] arr : array) {
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        printArray(array);
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        printArray(array);
    }

    public static void fillArray2() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        printArray(array);
    }

    public static void fillDiagonal() {
        Random random = new Random();
        int[][] array = new int[5][5];

        // заполнение массива произвольными числами
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || array.length - i - 1 == j) {
                    array[i][j] = 1;
                }
               /*
               Другой вариант
               if (i == j || i == array[i].length - 1 - j) {
                    array[i][j] = 1;
                }
                */

            }
        }
        printArray(array);
    }

    public static void getArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        printArray(array);
    }

    public static void findMinMax() {
        Random random = new Random();
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        printArray(array);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    public static boolean checkBalance(int[] array) {
        int pos = 1;
        boolean isBalanced = false;
        while (true) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int i = 0; i < pos; i++) {
                sumLeft += array[i];
            }
            for (int i = pos; i < array.length; i++) {
                sumRight += array[i];
            }
            isBalanced = sumLeft == sumRight;
            pos++;

            if (isBalanced || pos >= array.length) {
                break;
            }
        }
        return isBalanced;
    }

    /*
    8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
     [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
     */
    public static int[] shiftArray(int[] array, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                moveRight(array);
            }
        } else if (n < 0) {
            for (int i = 0; i > n; i--) {
                moveLeft(array);
            }
        }
        return array;
    }

    private static void moveRight(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    private static void moveLeft(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }
}

