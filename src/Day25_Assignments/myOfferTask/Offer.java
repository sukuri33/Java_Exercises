package Day25_Assignments.myOfferTask;

public class Offer {

    String location,companyName,jobTitle;
    int salary;
    boolean hasBenefit,hasPTO,isWFH,isFullTime;

    public Offer(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {

        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary='" + salary + '\'' +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}

/*
    Task 05:
    Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object
 */
