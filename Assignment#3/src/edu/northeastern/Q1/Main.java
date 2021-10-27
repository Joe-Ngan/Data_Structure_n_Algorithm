package edu.northeastern.Q1;

public class Main {

    public static void main(String[] args) {
        Moody sad = new Sad();
        Moody happy = new Happy();

        Psychiatrist psychiatrist = new Psychiatrist();

        psychiatrist.examine(happy);
        psychiatrist.observe(happy);
        psychiatrist.examine(sad);
        psychiatrist.observe(sad);

    }
}
