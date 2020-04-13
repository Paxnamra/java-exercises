package practise_exercises.code_wars;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class MinutesToMidnight {
    public static String countMinutes(Date d) {
        LocalDateTime convertDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        long hoursToMinutes = convertDate.toLocalTime().getHour() * 60;
        long secondsToMinutes = convertDate.toLocalTime().getSecond() % 1000;

        if (secondsToMinutes % 60 > 0) {
            secondsToMinutes = 1;
        }

        long minutes = hoursToMinutes + convertDate.getMinute() + secondsToMinutes;
        return ((24 * 60 - minutes) == 1) ? 24 * 60 - minutes + " minute" : 24 * 60 - minutes + " minutes";
    }
}

