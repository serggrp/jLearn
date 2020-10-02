package ru.sergie.reflection;

public class DataClass {
    private String hidedString;
    public String openString;
    private static int counter;
    private int instanceId;
    public DataClass(String hidedString, String openString) {
        this.hidedString = hidedString;
        this.openString = openString;
        instanceId = ++counter;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public String getHidedString() {
        return hidedString;
    }

    public static int getCounter() {
        return counter;
    }
}
