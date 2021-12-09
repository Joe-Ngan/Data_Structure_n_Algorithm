package Question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(01, "Jack", 3.3, new Date(1999,11,11));
        Student student2 = new Student(02, "Mary", 3.5, new Date(2000,3,15));
        Student student3 = new Student(03, "Ritter", 3.1, new Date(2002,1,19));
        Student student4 = new Student(04, "Eric", 3.0, new Date(1996,5,31));
        Student student5 = new Student(05, "Liz", 4.0, new Date(1994,6,28));
        List<Student> list = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));

        for(Student s : list){
            System.out.println(s.toString());
        }

        Collections.sort(list, new Student.NameComparator());
        System.out.println("---------------------------------------");
        System.out.println("sorted by name in ascending order:");
        for(Student s : list){
            System.out.println(s.toString());
        }

        Collections.sort(list, new Student.GpaComparator());
        System.out.println("---------------------------------------");
        System.out.println("sorted by gpa in descending order:");
        for(Student s : list){
            System.out.println(s.toString());
        }
        Collections.sort(list, new Student.DateOfBirthComparator());
        System.out.println("---------------------------------------");
        System.out.println("sorted by date of birth in ascending order:");
        for(Student s : list){
            System.out.println(s.toString());
        }
    }

}
