package ru.sergie;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = Arrays.asList("rockSong1", "rockSong2", "rockSong3");
    public List<String> getSong() {
        return songs;
    }
}
