package edu.northeastern.Q1;

public class Sad extends Moody{
    String mood = "sad";

    @Override
    public String getMood(){
        return "waah";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println(getMood());
    }

    public String toString(){
        return "Subject cries a lot";
    }
}
