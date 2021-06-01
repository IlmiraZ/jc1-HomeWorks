package ru.ilmira.lesson6;

public abstract class Animal {
    private static int animalCount;

    public Animal() {
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}







