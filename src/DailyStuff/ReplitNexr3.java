package DailyStuff;

import java.util.Scanner;

public class ReplitNexr3 {

    public static double waterTax(double units){
        //WRITE YOUR CODE BELOW:
        double bill = 0;

        if (units > 50 ) {
            bill = units * 0.90;
        }else if (units >= 0 && units <= 50){
            bill = units * 0.60;
        }

        if (units > 100 && units <=150) {
        bill += 50;
        } else if (units > 150) {
        bill += 100;
        }

        return bill;
    }//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }
}
