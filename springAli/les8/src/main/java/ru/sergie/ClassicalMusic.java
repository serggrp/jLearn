package ru.sergie;

public class ClassicalMusic implements Music{
    public String getSong() {
        return "Hungarian rhapsody";
    }
    public void doMyInit(){
        System.out.println("Initialization method");
    }
    public void doMyDestroy(){
        System.out.println("Destroying method");
    }
    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
}
