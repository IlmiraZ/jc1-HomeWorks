package ru.ilmira.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food < 0) { // Проверка на корректность ввода
            throw new Error("Количество еды должно быть больше нуля!");
        }
        this.food = food;
    }

    public void decreaseFood(int n) {
        if ((food - n) < 0) {
            System.out.println("В тарелке недостаточно еды!");
        } else {
            food -= n;
        }
    }

    public void addFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
}

