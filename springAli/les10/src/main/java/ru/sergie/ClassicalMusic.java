package ru.sergie;

import org.springframework.stereotype.Component;

@Component("classMusicBean")
public class ClassicalMusic implements Music{
    public String getSong() {
        return "Hungarian rhapsody";
    }
}
