package com.used;

public class Dog {
    private String name;
    private String color;
    private int height;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}

