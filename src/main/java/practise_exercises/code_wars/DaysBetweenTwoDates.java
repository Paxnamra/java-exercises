package practise_exercises.code_wars;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenTwoDates {

    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {
        LocalDate startDate = LocalDate.of(year, month, day);
        LocalDate endDate = LocalDate.of(year2, month2, day2);

        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}
