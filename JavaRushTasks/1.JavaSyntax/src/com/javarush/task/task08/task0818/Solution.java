package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 10000);
        map.put("Petrov", 500);
        map.put("Sidorov", 200);
        map.put("Vasin", 300);
        map.put("Dmitriev", 130);
        map.put("Svetina", 921);
        map.put("Pavlov", 787);
        map.put("Olgina", 122);
        map.put("Sergeev", 223);
        map.put("Stepin", 554);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            if (iter.next().getValue() < 500)
                iter.remove();
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
    }
}