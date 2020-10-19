package ru.sergie;

import java.util.List;

public class MusicPlayer {
    private List<Music> music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    //IoC
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer(){}
    public void playMusic(){
        for (Music msc : music) {
            System.out.println("Playing: " + msc.getSong());
        }
    }
}
