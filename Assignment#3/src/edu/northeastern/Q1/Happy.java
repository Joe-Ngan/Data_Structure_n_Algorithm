package edu.northeastern.Q1;

public class Happy extends Moody{
    String mood = "happy";

    @Override
    public String getMood() {
        return "heeehee....";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println(getMood());
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}
