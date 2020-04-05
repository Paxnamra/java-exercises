package practise_exercises.code_wars;

import java.time.Duration;
import java.util.Date;

public class CountDays {

    public String countDays(Date d) {

        if (daysDifference(d) > 0) {
            return "The day is in the past!";
        } else if (daysDifference(d) < 0) {
            return Math.abs(daysDifference(d)) + " days";
        } else {
            return "Today is the day!";
        }
    }

    private long daysDifference(Date d) {
        Date nowDate = new Date();
        return (Duration.between(d.toInstant(), nowDate.toInstant()).toDays());
    }
}
