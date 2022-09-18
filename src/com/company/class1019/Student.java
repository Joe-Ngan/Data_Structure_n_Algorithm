package company.class1019;

public class Student {
    private Integer studentID;
    private String name;

    public Integer getStudentID(){
        return studentID;
    }
    public String getName(){
        return name;
    }
    public Student(String name, Integer studentID){
        this.name = name;
        this.studentID = studentID;
    }
    public void getGrades(Publisher publisher, String className, String grade){
        System.out.println(publisher.getName() + "Has published grades for class "+className);
        System.out.println("Your grade in "+ className +"is" + grade);
    }

    public void subscribe(Publisher publisher){
        publisher.addSubscriber(this);
    }

    public void unSubscribe(Publisher publisher){
        publisher.removeSubscriber(this);
    }
}
