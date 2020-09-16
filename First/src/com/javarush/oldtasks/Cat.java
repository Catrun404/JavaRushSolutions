package com.javarush.oldtasks;

public class Cat {
    private String name;
    private String address;
    private String color = "grey";
    private int weight = 1;
    private int age = 1;

    public Cat(String name) {
        this.name = name;
        color = "grey";
        weight = 1;
        age = 1;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        color = "grey";
        weight = 1;
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.weight = weight;
        age = 1;

    }

    public Cat(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.weight = weight;
        age = 1;
    }


    public static void main(String[] args) {

    }
}

