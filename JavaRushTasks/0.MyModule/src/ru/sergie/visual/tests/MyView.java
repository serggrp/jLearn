package ru.sergie.visual.tests;

import ru.sergie.visual.listeners.FrameListener;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyView extends JFrame {
    public MyView(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        MyView mv = new MyView();

        mv.setVisible(true);
    }
}
