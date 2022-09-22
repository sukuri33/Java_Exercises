package Day24_Assignments_DateRelated;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExplore {




    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        System.out.println(localDateTime.format(df));


        String myD = "From Date:Sat Jan 01 00:00:00 CST 2022";
        String str = myD.substring(myD.indexOf(":")+1);
        LocalDateTime parse = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String format = parse.format(dateTimeFormatter);
        System.out.println(format);

    }

}
