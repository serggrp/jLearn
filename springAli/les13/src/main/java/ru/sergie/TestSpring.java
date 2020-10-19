package ru.sergie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
     MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.playMusic());
//        ClassicalMusic cm = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic cm2 = context.getBean("classMusicBean", ClassicalMusic.class);

//        System.out.println(cm == cm2);
        context.close();
    }
}
