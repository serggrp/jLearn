package ru.sergie.reflection;

import java.lang.reflect.Field;

public class Examinator {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object dc1 = new DataClass("specific string", "see it");
        System.out.println(dc1.getClass());
        System.out.println("Let's create something");
        DataClass dc2 = new DataClass("hide 2", "open 2");
        System.out.println(dc2.getInstanceId());
        Field counter = dc2.getClass().getDeclaredField("counter");
        counter.setAccessible(true);
        counter.setInt(dc2, 5);
        DataClass dc3 = new DataClass("hide 3", "open 3");
        System.out.println(dc3.getInstanceId());

    }
}
