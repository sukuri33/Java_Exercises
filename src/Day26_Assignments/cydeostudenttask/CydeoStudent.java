package Day26_Assignments.cydeostudenttask;

public class CydeoStudent {

    public String name,batchNumber;
    public int age,id,grade,groupNumber;
    public static String schoolName,magicWord;

    static{
        schoolName = "Cydeo school";
        magicWord = "Wooden Spoon";
    }

    public CydeoStudent(String name, String batchNumber, int age, int id, int grade, int groupNumber) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.groupNumber = groupNumber;
    }

    public String study(){
        return name+" is studying java at "+schoolName;
    }

    public String attendedClass(){
        return name+" has attended class in "+batchNumber;
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public void printProgramLanguage(){
        System.out.println(name+" learned Java coding language");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
