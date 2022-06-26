package Day24_Assignments_DateRelated;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExplore {




    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        System.out.println(localDateTime.format(df));

    }

}
