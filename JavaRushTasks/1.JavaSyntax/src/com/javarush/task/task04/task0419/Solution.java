package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        if (max(a, b) > max(c, d))
            System.out.println(max(a, b));
        else
            System.out.println(max(c, d));
    }
    public static int max (int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }
}
