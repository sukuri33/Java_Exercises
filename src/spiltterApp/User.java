package spiltterApp;

public class User {

    public String fName;
    public String lName;
    public String email;
    public String uid;


/*    public void setInfo(String fName, String lName, String email, String uid) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.uid = uid;
    }*/

    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
