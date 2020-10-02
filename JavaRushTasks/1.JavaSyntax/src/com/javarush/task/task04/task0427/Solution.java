package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num > 0 && num < 1000){
            if (num % 2 == 0){
                System.out.print("четное ");
            }
            else
                System.out.print("нечетное ");
            if (num / 100 >= 1){
                System.out.println("трехзначное число");
            }
            else
                if (num / 10 >= 1){
                    System.out.println("двузначное число");
                }
                else
                    System.out.println("однозначное число");
        }
    }
}
