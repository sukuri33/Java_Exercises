package Day25_Assignments.StudentTask;

import java.util.ArrayList;

public class TestObjects {


    public static void main(String[] args) {


        Student student1 = new Student("Alim",25,'M',"A001");
        Student student2 = new Student("Nevran",30,'M',"A002");
        Student student3 = new Student("Ainoor",21,'F',"A003");

        ArrayList<Student> group1 = new ArrayList<>();
        group1.add(student1);
        group1.add(student2);
        group1.add(student3);
        StudentsGroup group = new StudentsGroup("Wolf","G1",group1);

        group.removeStudent("A001");

        System.out.println(group);

        group.addStudent(new Student("Malim",27,'M',"A001"));

        System.out.println(group);
    }

}
