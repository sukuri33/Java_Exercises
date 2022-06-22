package Day25_Assignments.StudentTask;

import java.util.ArrayList;

public class StudentsGroup {


    String groupName;
    String groupId;
    ArrayList<Student> students;

    public StudentsGroup(String groupName, String groupId, ArrayList<Student> students) {
        this.groupName = groupName;
        this.groupId = groupId;
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
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
}
