package com.javarush.task.task05.task0527;

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry",12,5);
        Dog butcherDog = new Dog("Butcher", 95,32);
        Cat fluffyCat = new Cat("Fluffy", 40,29);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
