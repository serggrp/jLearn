package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallone1", df.parse("MAY 2 1983"));
        map.put("Stallone2", df.parse("MARCH 3 1984"));
        map.put("Stallone3", df.parse("SEPTEMBER 3 1984"));
        map.put("Stallone4", df.parse("APRIL 3 1984"));
        map.put("Stallone5", df.parse("FEBRUARY 3 1984"));
        map.put("Stallone6", df.parse("JANUARY 3 1984"));
        map.put("Stallone7", df.parse("MARCH 3 1981"));
        map.put("Stallone8", df.parse("AUGUST 3 1984"));
        map.put("Stallone9", df.parse("JULY 3 1984"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            int mont = iter.next().getValue().getMonth();
            if (mont > 4 && mont < 8)
                iter.remove();
        }
    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> res = createMap();
        removeAllSummerPeople(res);
    }
}
