package com.javarush.task.task05.task0501;

/* 
Создание кота
*/

public class Cat {
    //напишите тут ваш код
    public String name;
    public int age, weight, strength;
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Vaska";
        cat.age = 5;
        cat.strength = 10;
        cat.weight = 3;
    }
}
