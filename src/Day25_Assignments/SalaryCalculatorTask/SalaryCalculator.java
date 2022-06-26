package Day25_Assignments.SalaryCalculatorTask;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public double hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    DecimalFormat df = new DecimalFormat("0.00");

    public SalaryCalculator(double hourlyRate,int weeklyHours,double stateTaxRate,double federalTaxRate){

        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary() * (stateTaxRate/100);
    }

    public double federalTax(){
        return salary() * (federalTaxRate/100);
    }

    public double salaryAfterTax(){
        return salary() - (stateTax() + federalTax());
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTax=" + df.format(stateTax()) +
                ", federalTax=" + df.format(federalTax()) +
                ", salaryAfterTax=" + df.format(salaryAfterTax()) +
                '}';
    }
}
/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): claculates the totalstateTax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
