package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine());
            if (min > list.get(i).length())
                min = list.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if (min == list.get(i).length())
                System.out.println(list.get(i));

        }
    }
}
