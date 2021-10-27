package edu.northeastern.Q1;


public abstract class Moody{
    public String mood;

    public abstract String getMood();

    public abstract void ExpressFeelings();

    public void queryMood(){
        System.out.println("I feel " + mood + " today!!");
    }
}
