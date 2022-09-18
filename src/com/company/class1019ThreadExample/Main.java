package company.class1019ThreadExample;

public class Main {
    public static void main(String[] args) {
        Person Ashish = new Person("ashish");

        Ashish.start();

        int counter = 15;
        while(counter<10){
            System.out.println("I am in main thread");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter--;
        }
        System.out.println();
    }
}
