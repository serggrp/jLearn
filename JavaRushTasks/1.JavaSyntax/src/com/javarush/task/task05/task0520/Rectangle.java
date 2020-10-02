package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = this.height = width;
    }
    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = this.height = 0;
    }

    public Rectangle(Rectangle r){
        this.height = r.height;
        this.left = r.left;
        this.top = r.top;
        this.width = r.width;
    }

    public static void main(String[] args) {

    }
}