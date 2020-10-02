package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    //idea1
    public static boolean isDateOdd(String date) {
        int odd = 0;
        try {
            Date dt = ((new SimpleDateFormat("MMMM d yyyy", Locale.US)).parse(date));
            Date startY = ((new SimpleDateFormat("MMMM d yyyy", Locale.US)).parse(date));
            startY.setMonth(0);
            startY.setDate(1);
            odd = (int)((dt.getTime() - startY.getTime())/(1000*3600*24) % 2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return odd == 0 ? true : false;
    }
    //idea2
//    public static boolean isDateOdd(String date) {
//        try {
//            Calendar cld = new GregorianCalendar(Integer.parseInt(date.split(" ")[2]),
//                    (new SimpleDateFormat("MMMM", Locale.US)).parse(date.split(" ")[0]).getMonth(),
//                    Integer.parseInt(date.split(" ")[1]));
//            return cld.get(Calendar.DAY_OF_YEAR) % 2 == 1 ? true : false;
//        }catch (Exception e){}
//        return true;
//    }
}
