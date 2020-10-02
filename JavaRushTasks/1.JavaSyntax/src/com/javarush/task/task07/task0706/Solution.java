package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] h = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            h[i] = Integer.parseInt(reader.readLine());
        }
        int odd = 0, even = 0;
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0)
                even += h[i];
            else
                odd += h[i];
        }
        System.out.printf("В домах с %s номерами проживает больше жителей.", even > odd ? "четными" : "нечетными" );
    }
}
