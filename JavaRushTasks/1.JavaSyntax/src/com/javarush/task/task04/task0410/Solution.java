package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //напишите тут ваш код
        if (a > 50 && a < 100)
            System.out.printf("Число %d содержится в интервале.", a);
        else
            System.out.printf("Число %d не содержится в интервале.", a);
    }
}