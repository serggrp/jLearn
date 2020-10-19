package ru.sergie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
//        musicPlayer.playMusic();
        ClassicalMusic cm = context.getBean("classMusicBean", ClassicalMusic.class);
//        ClassicalMusic cm2 = context.getBean("classMusicBean", ClassicalMusic.class);

//        System.out.println(cm == cm2);
        context.close();
    }
}
