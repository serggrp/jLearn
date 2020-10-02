package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Sidr");
        map.put("Vasin", "Vasya");
        map.put("Dmitriev", "Dima");
        map.put("Svetina", "Sveta");
        map.put("Pavlov", "Pavel");
        map.put("Olgina", "Olga");
        map.put("Sergeev", "Sergey");
        map.put("Stepin", "Stepan");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int result = 0;
        for (String s : map.values()) {
            if (s.equals(name))
                result++;
        }
        return result;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        return map.keySet().contains(lastName) ? 1 : 0;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        getCountTheSameFirstName(map, "Ivan");
        getCountTheSameLastName(map, "Ivanov");
    }
}
