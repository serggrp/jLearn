package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int positive = 0, negative = 0, i = 0;
        i = Integer.parseInt(reader.readLine());
        if (i != 0){
            if (i > 0)
                positive++;
            else
                negative++;
        }
        i = Integer.parseInt(reader.readLine());
        if (i != 0){
            if (i > 0)
                positive++;
            else
                negative++;
        }
        i = Integer.parseInt(reader.readLine());
        if (i != 0){
            if (i > 0)
                positive++;
            else
                negative++;
        }
        System.out.printf("количество отрицательных чисел: %d", negative);
        System.out.printf("количество положительных чисел: %d", positive);

    }
}
