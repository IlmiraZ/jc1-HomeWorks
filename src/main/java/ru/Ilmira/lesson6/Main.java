package ru.Ilmira.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушок");
        Cat cat3 = new Cat("Дымок");
        cat1.run(100);
        cat2.run(0);
        cat3.run(201);
        cat3.swim(10);
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println();

        Dog dog1 = new Dog("Дружок");
        Dog dog2 = new Dog("Чарли");
        Dog dog3 = new Dog("Пират");
        dog1.run(500);
        dog1.swim(15);
        dog2.run(600);
        dog2.swim(10);
        dog3.run(450);
        dog3.swim(8);
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println();

        System.out.println("Всего животных: " + Animal.getAnimalCount());

    }


}
