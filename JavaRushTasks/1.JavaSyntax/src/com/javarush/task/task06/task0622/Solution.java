package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nums = "3\n" +
                "2\n" +
                "15\n" +
                "6\n" +
                "17";
//        reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(nums.getBytes())));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int min = Integer.MIN_VALUE;

        for (int i = 0; i <5; i++) {
            min = min(min(min(min(a,b,min),c,min),d,min),e,min);
            System.out.println(min);
        }
        //напишите тут ваш код
    }
    public static int min (int a, int b, int lim){
        if (a <= lim)
            return b;
        if (b <= lim)
            return a;
        return a < b ? a : b;
    }
}
