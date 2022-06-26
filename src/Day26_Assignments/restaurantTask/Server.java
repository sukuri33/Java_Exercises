package Day26_Assignments.restaurantTask;

import java.time.LocalDate;

public class Server extends Employee{

/*    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;
    public LocalDate hire_date;*/

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder(){
        System.out.println(name+" is taking an order");
    }

    public void cleanTable(){
        System.out.println(name+" is cleaning the table");
    }

    public String toString() {

        String fullOrePart = isFullTime ? "Full-Time":"Part-Time";

        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + fullOrePart +
                ", hire_date=" + hire_date +
                '}';
    }
}
