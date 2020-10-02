package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String names = "дедушка Вася\n" +
                "бабушка Мурка\n" +
                "папа Котофей\n" +
                "мама Василиса\n" +
                "сын Мурчик\n" +
                "дочь Пушинка";
//        reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(names.getBytes())));
        Cat granfa = new Cat(reader.readLine(), null, null);
        Cat granma = new Cat(reader.readLine(), null, null);
        Cat fa = new Cat(reader.readLine(), null, granfa);
        Cat ma = new Cat(reader.readLine(), granma, null);
        Cat son = new Cat(reader.readLine(), ma, fa);
        Cat dau = new Cat(reader.readLine(), ma, fa);


        System.out.println(granfa);
        System.out.println(granma);
        System.out.println(fa);
        System.out.println(ma);
        System.out.println(son);
        System.out.println(dau);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            return "The cat's name is " + name + (mother != null ? (", mother is " + mother.name) : ", no mother") + (father != null ? (", father is " + father.name) : ", no father");
        }
    }

}
