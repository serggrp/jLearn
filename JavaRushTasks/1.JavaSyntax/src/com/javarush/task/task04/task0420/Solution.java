package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a >= b && a >= c){
            if (b >= c)
                print(a, b, c);
            else
                print(a, c, b);
        }
        else
            if (b >= a && b >= c){
                if (a >= c)
                    print(b, a, c);
                else
                    print(b, c, a);
            }
            else {
                if (a >= b)
                    print(c, a, b);
                else
                    print(c, b, a);
            }
    }

    public static void print (int a, int b, int c){
        System.out.printf("%d %d %d", a, b, c);
    }
}
