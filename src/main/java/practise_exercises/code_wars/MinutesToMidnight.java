package practise_exercises.code_wars;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class MinutesToMidnight {
    public static String countMinutes(Date d) {
        LocalDateTime convertDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        int hours = convertDate.toLocalTime().getHour() * 60;
        int seconds = convertDate.toLocalTime().getSecond() % 1000;
        int countMinutes = 1440 - (hours + convertDate.getMinute() + (seconds > 0 ? 1 : 0));

        return countMinutes + (countMinutes == 1 ? " minute" : " minutes");
    }
}

