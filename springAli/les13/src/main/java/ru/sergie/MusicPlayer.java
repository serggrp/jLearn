package ru.sergie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }

    private List<Music> genresList;
//@Autowired
    public MusicPlayer(List<Music> genresList){
        this.genresList = genresList;
    }

    public String playMusic(){
        return genresList.get(new Random().nextInt( 2)).getSong();
    }
}
