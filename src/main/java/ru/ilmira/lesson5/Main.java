package ru.ilmira.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Manager", "ivanov@mail.ru", "89991231223", 50000, 25);
        employees[1] = new Employee("Petrov Petr", "Engineer", "petrov@mail.ru", "89991231111", 45000, 30);
        employees[2] = new Employee("Serova Mariya ", "Accountant", "serova@mail.ru", "89991230000", 60000, 50);
        employees[3] = new Employee("Vagapov Nikita", "Architect", "vagapov@mail.ru", "89991232222", 65000, 45);
        employees[4] = new Employee("Belova liya", "HR", "liya@mail.ru", "89991112233", 35000, 23);


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i]);
                //    employees[i].printInfo(); // Другой способ вывода информации
            }
        }
    }
}

