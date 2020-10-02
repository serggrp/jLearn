package ru.sergie.reflection;

public class SomeDataClass implements Cloneable{
    private String data;

    public SomeDataClass(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
