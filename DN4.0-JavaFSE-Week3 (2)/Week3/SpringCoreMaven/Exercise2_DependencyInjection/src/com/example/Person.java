package com.example;

public class Person {
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
