package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = new String[10];
        int[] lengths = new int[10];
        for (int i = 0; i < 10; i++) {
            lines[i] = reader.readLine();
            lengths[i] = lines[i].length();
        }
        for (int i = 0; i < lengths.length; i++) {
            System.out.println(lengths[i]);
        }
    }
}
