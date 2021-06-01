package ru.ilmira.lesson5;

public class Employee {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Переопределила стандартый метод для отображении информации об объекте.
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    // Написала отдельный метод для демонстрации разных вариантов решения этой задачи.
    public void printInfo() {
        System.out.println("ФИО: " + name + ", Должность: " + post + ", email: " + email + ", Контакты: " + phoneNumber + ", Зарплата: " + salary + ", Возраст: " + age);
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

