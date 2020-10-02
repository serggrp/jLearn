package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date curDate = new Date();
        System.out.printf("%td %tm %tY", curDate, curDate, curDate);
    }
}
