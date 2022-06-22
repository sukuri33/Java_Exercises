package Day25_Assignments.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {


    String groupName;
    String groupId;
    ArrayList<Student> students;

    public StudentsGroup(String groupName, String groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addStudent(String name,int age,char gender, String id){
        students.add( new Student(name,age,gender,id));
    }

    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));
    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", students=" + students +
                ", total number of students =" + students.size() +
                '}';
    }

    public void addStudent(Student[] studentArr) {
        students.addAll(Arrays.asList(studentArr));
    }
}
