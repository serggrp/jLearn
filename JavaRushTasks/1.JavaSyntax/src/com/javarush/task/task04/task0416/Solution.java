package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double mins = Double.parseDouble(reader.readLine());
        mins = mins % 5;
        if (mins < 3){
            System.out.println("зелёный");
        }
        else
            if (mins < 4){
                System.out.println("жёлтый");
            }
            else
                System.out.println("красный");
    }
}