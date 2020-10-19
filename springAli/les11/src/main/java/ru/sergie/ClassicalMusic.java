package ru.sergie;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = Arrays.asList("classicalSong1", "classicalSong2", "classicalSong3");
    public List<String> getSong() {
        return songs;
    }
}
