package ru.sergie;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
