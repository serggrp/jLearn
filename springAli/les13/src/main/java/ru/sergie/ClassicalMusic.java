package ru.sergie;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

//@Component("classMusicBean")
//@Scope("prototype")
public class ClassicalMusic implements Music{
    public String getSong() {
        return "Hungarian rhapsody";
    }
}
