package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Sidr");
        map.put("Vasin", "Vasya");
        map.put("Dmitriev", "Ivan");
        map.put("Svetina", "Sveta");
        map.put("Pavlov", "Pavel");
        map.put("Olgina", "Olga");
        map.put("Sergeev", "Vasya");
        map.put("Stepin", "Stepan");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Set<String> toRemove = new HashSet();
        for (String s : map.values()) {
            if (Collections.frequency(map.values(), s) > 1)
                toRemove.add(s);
        }
        for (String s : toRemove) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
    }
}
