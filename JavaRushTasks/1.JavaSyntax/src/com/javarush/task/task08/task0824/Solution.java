package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Jack", true, 10, null);
        Human son2 = new Human("James", true, 12, null);
        Human daughter = new Human("Jenny", false, 5, null);
        ArrayList<Human> listChild = new ArrayList<>(Arrays.asList(son1,son2,daughter));
        Human mom = new Human("Liz", false, 40, listChild);
        Human dad = new Human("Bob", true, 45, listChild);
        Human grandM1 = new Human("Olivia", false, 70, new ArrayList<>(Arrays.asList(mom)));
        Human grandP1 = new Human("Nikola", true, 72, new ArrayList<>(Arrays.asList(mom)));
        Human grandM2 = new Human("Bella", false, 74, new ArrayList<>(Arrays.asList(dad)));
        Human grandP2 = new Human("Sam", true, 76, new ArrayList<>(Arrays.asList(dad)));
        for (Human human : Arrays.asList(son1, son2, daughter, mom, dad, grandM1, grandM2, grandP1, grandP2)) {
            System.out.println(human);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children == null ? new ArrayList<Human>(0) : children;
        }

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
