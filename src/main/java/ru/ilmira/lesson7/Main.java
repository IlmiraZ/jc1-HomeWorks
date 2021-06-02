package ru.ilmira.lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Пушок", 10);
        cats[1] = new Cat("Дружок", 5);
        cats[2] = new Cat("Дымок", 25);
       // plate.addFood(50); // Если добавить еды, то все коты сыты и довольны
        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isHungry()) {
                System.out.println("Кот " + cat.getName() + " не голоден");
            } else {
                System.out.println("Кот " + cat.getName() + " голоден");
            }
        }
        plate.info();
    }
}

