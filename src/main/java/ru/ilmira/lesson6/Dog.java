package ru.ilmira.lesson6;

public class Dog extends Animal {
    private static int dogCount;
    private String name;
    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Дистанция должна быть больше 0 м.");
        } else if (distance > maxRunDistance) {
            System.out.println(getName() + " не может пробежать более " + maxRunDistance + " м.");
        } else {
            System.out.println(getName() + " пробежал(а) " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("Дистанция должна быть больше 0 м. ");
        } else if (distance > maxSwimDistance) {
            System.out.println(getName() + " не может проплыть более " + maxSwimDistance + " м.");
        } else {
            System.out.println(getName() + " проплыл(а) " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }

    public String getName() {
        return name;
    }
}
