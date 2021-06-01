package ru.ilmira.lesson6;

public class Cat extends Animal {

    private static int catCount;
    private String name;
    private static final int maxDistance = 200;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Дистанция должна быть больше 0 м.");
        } else if (distance > maxDistance) {
            System.out.println(getName() + " не может пробежать более " + maxDistance + " м.");
        } else {
            System.out.println(getName() + " пробежал(а) " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }
}
