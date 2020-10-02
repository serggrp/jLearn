package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int result = 0;
        if (this.strength > anotherCat.strength)
            result++;
        else
            if (this.strength < anotherCat.strength)
                result--;
        if (this.weight > anotherCat.weight)
            result++;
        else
            if (this.weight < anotherCat.weight)
                result--;
        if (this.age > anotherCat.age)
            result++;
        else
         if (this.age < anotherCat.age)
             result--;
        return result > 0;
    }

    public static void main(String[] args) {

    }
}
