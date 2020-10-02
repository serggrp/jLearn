package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    String address;
    int age;
    int weight;
    String color;

    public void initialize(String name){
        this.name = name;
        this.address = null;
        this.age = 3;
        this.weight = 4;
        this.color = "default";
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.address = null;
        this.age = age;
        this.weight = weight;
        this.color = "default";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.address = null;
        this.age = age;
        this.weight = 4;
        this.color = "default";
    }
    public void initialize(int weight, String color){
        this.name = null;
        this.address = null;
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String address){
        this.name = null;
        this.address = address;
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
