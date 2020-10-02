package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        if (Integer.parseInt(reader.readLine()) > 0)
            result++;
        if (Integer.parseInt(reader.readLine()) > 0)
            result++;
        if (Integer.parseInt(reader.readLine()) > 0)
            result++;
        System.out.println(result);
    }
}
