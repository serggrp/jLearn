package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public void initialize (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.height = this.width = 0;
    }
    public void initialize(int top, int left, int height) {
        this.top = top;
        this.left = left;
        this.height = this.width = height;
    }
    public void initialize(Rectangle r){
        this.left = r.left;
        this.top = r.top;
        this.height = r.height;
        this.width = r.width;
    }


    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.initialize(1,1);
        System.out.println(r.height);
    }
}
