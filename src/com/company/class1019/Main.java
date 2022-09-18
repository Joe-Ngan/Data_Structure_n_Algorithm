package company.class1019;

public class Main {
    public static void main(String[] args) {
        Publisher ashish = new Publisher("Ashish", "infor5100");

        Student Mark = new Student("abc", 1);
        Student Peter = new Student("abc", 2);
        Student Sara = new Student("abc", 2);

        ashish.addGrades(1, "A");

        Mark.subscribe(ashish);
        Peter.subscribe(ashish);
        Sara.subscribe(ashish);


        ashish.notifyGrades();

    }
}
