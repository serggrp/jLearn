package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int max = 0, curr = Integer.MIN_VALUE, cnt = 1;
        for (Integer integer : list) {
            if (integer != curr){
                if (cnt > max)
                    max = cnt;
                cnt = 1;
                curr = integer;
            }
            else {
                cnt++;
            }
        }
        System.out.println(cnt > max ? cnt : max);


    }
}