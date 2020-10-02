package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandf1 = new Human("Mike", true, 70);
        Human grandm1 = new Human("Minne", false, 68);
        Human grandm2 = new Human("Anne", false, 71);
        Human grandf2 = new Human("Nick", true, 75);
        Human fath = new Human("Bill", true, 35, grandf1, grandm1);
        Human moth = new Human("Lea", false, 31, grandf2, grandm2);
        Human daught = new Human("Mist", false, 8, fath, moth);
        Human son = new Human("Jack", true, 11, fath, moth);
        Human son1 = new Human("Jess", true, 4, fath, moth);

        System.out.println(grandf1);
        System.out.println(grandm1);
        System.out.println(grandf2);
        System.out.println(grandm2);
        System.out.println(fath);
        System.out.println(moth);
        System.out.println(son);
        System.out.println(son1);
        System.out.println(daught);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human mother, father;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}