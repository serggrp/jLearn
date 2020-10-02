package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        if (num.startsWith("-"))
            System.out.println(Integer.parseInt(num)+1);
        else
            System.out.println(Integer.parseInt(num)*2);
    }

}