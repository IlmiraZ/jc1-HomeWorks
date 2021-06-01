package ru.ilmira.lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean isHungry = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isHungry = true;
        } else {
            isHungry = false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }
}
