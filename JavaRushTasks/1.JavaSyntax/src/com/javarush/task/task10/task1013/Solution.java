package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.List;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private boolean sex;
        private int age;
        private String address;
        private String phone;
        private List<Human> children;


        public Human(String name, boolean sex, int age, String address, String phone, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.children = children;
        }

        public Human(String name, boolean sex, int age, String address) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        public Human(String name, boolean sex, int age, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age, String address, String phone) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.children = children;
        }
        public Human(String name, String phone, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.children = children;
        }
        public Human(String name, boolean sex,  String phone, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.children = children;
        }
        public Human(String name, int age, String address, String phone, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.children = children;
        }




    }
}
