package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        Random rand = new Random(46);
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            result.add(rand.nextInt());
        }
        return result;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            if(iter.next() > 10)
                iter.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        removeAllNumbersGreaterThan10(set);
    }
}
