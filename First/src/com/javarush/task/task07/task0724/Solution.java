package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human anna = new Human("Anna", false, 50);
        Human janna = new Human("Janna", false, 42);
        Human jhin = new Human("Jhin", true, 53);
        Human alex = new Human("Alex", true, 48);
        Human ujin = new Human("Ujin", true, 22, jhin, anna);
        Human lexa = new Human("Lexa", false, 21, alex, janna);
        Human minni = new Human("Minnie", false, 3, ujin, lexa);
        Human johan = new Human("Johan", true, 3, ujin, lexa);
        Human henry = new Human("Henry", true, 1, ujin, lexa);

        System.out.println(anna.toString());
        System.out.println(janna.toString());
        System.out.println(jhin.toString());
        System.out.println(alex.toString());
        System.out.println(ujin.toString());
        System.out.println(lexa.toString());
        System.out.println(minni.toString());
        System.out.println(johan.toString());
        System.out.println(henry.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}





























