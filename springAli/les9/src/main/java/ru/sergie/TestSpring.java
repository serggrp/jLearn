package ru.sergie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
        Music clMusic = context.getBean("classMusicBean", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(clMusic);
        musicPlayer2.playMusic();

        context.close();
    }
}
