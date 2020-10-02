package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Мама мыла раму.".getBytes())));
        String line = reader.readLine();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)||String.valueOf(c).matches("\\p{Punct}")){
                if (isVowel(c)) {
                    vowels.append(c);
                    vowels.append(" ");
                }
                else{
                    consonants.append(c);
                    consonants.append(" ");
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}