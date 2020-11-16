package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int id;
        private String name;
        private String lastName;
        private int age;
        private Human mother;
        private Human father;

        public Human(int id, String name, String lastName, int age) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }


        public Human(int id, String name, String lastName, int age, Human mother, Human father) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(int id, String name, String lastName) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
        }

        public Human() {
        }

        public Human(int id, String name, String lastName, Human mother, Human father) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String lastName, int age, Human mother, Human father) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }
    }
}






























