package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;

/*
Собираем семейство
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Kelly", false, 10);
        Human child2 = new Human("Milly", false, 10);
        Human child3 = new Human("Mike", true, 3);
        Human father = new Human("Nick", true, 32, child1, child2, child3);
        Human mother = new Human("Liza", false, 29, child1, child2, child3);
        Human grandpa1 = new Human("Jhon", true, 67, father);
        Human grandpa2 = new Human("Peter", true, 69, mother);
        Human grandma1 = new Human("Julia", false, 65, father);
        Human grandma2 = new Human("Liliya", false, 65, mother);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            for (Human child : children) {
                this.children.add(child);
            }
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

//напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}






























