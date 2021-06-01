package ru.ilmira.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static int SIZE = 4;
    public static char[][] map = new char[SIZE][SIZE];
    public static final char DOT_EMPTY = '•';
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_BOT = 'O';

    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        start();
        scanner.close();
    }

    public static void start() {
        initMap();
        printMap();
        boolean isHumanMove = rand.nextBoolean();
        while (true) {
            if (isHumanMove) {
                humanTurn();
                printMap();
                if (isHumanWin()) {
                    System.out.println("Победил человек!");
                    break;
                }
            } else {
                botTurn();
                printMap();
                if (isBotWin()) {
                    System.out.println("Победил компьютер :(");
                    break;
                }
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            isHumanMove = !isHumanMove;
        }
    }

    public static void initMap() {
        for (char[] chars : map) {
            Arrays.fill(chars, DOT_EMPTY);
        }
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isWin(char ch) {
        int diagonal1 = 0, diagonal2 = 0;

        for (int i = 0; i < map.length; i++) {
            int horizontal = 0, vertical = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == ch) horizontal++;
                if (map[j][i] == ch) vertical++;
            }
            if (horizontal == SIZE || vertical == SIZE) return true;
            if (map[i][i] == ch) diagonal1++;
            if (map[i][map[i].length - i - 1] == ch) diagonal2++;
        }
        return diagonal1 == SIZE || diagonal2 == SIZE;
    }

    public static boolean isHumanWin() {
        return isWin(DOT_HUMAN);
    }

    public static boolean isBotWin() {
        return isWin(DOT_BOT);
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void botTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellValid(x, y));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_BOT;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (isCellValid(x, y));
        map[y][x] = DOT_HUMAN;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
        return map[y][x] != DOT_EMPTY;
    }
}
