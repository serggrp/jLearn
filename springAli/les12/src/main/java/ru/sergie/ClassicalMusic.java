package ru.sergie;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component("classMusicBean")
//@Scope("prototype")
public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Init classic");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroying");
    }
    public String getSong() {
        return "Hungarian rhapsody";
    }
}
