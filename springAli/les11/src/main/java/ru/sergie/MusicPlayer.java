package ru.sergie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre){
        List<String> songs = new ArrayList<String>();
        if (genre == MusicGenre.CLASSICAL)
            songs = classicalMusic.getSong();
        if (genre == MusicGenre.ROCK)
            songs = rockMusic.getSong();
        System.out.println("Playing: " + songs.get(new Random().nextInt(3)));
    }
}
