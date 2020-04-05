package practise_exercises.code_wars;

import java.time.Duration;
import java.util.Date;

public class CountDays {

    public String countDays(Date d) {
        return daysDifference(d) > 0 ? "The day is in the past!"
                : daysDifference(d) < 0 ? Math.abs(daysDifference(d)) + " days"
                : "Today is the day!";
    }

    private long daysDifference(Date d) {
        Date nowDate = new Date();
        return (Duration.between(d.toInstant(), nowDate.toInstant()).toDays());
    }
}
