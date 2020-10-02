package ru.sergie.reflection;

public class CloneExam {
    public static void main(String[] args) throws Exception{
        SomeDataClass sdc = new SomeDataClass("First instance");
        SomeDataClass sdc2 = new SomeDataClass("Second instance");
        SomeDataClass sdc0 = (SomeDataClass)sdc.clone();
        sdc0.setData("AHAH");
        System.out.println(sdc);
        System.out.println(sdc0);
    }
}
