package company.class1019ThreadExample;

import java.util.ArrayList;

public class Person extends Thread{

    String personName;

    private ArrayList<Person> followers;

    public String getPersonName(){
        return personName;
    }
    public Person(String personName){
        this.personName = personName;
        this.followers = new ArrayList<>();
    }

    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println(personName +" is alive");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Unable to sleep");
            }
        }
        System.out.println("I am dead");
    }

    public void Tweet(String tweetmessage){
        for(Person person: followers){
            //
        }
    }
}
