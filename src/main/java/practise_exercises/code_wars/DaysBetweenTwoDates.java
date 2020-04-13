package practise_exercises.code_wars;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class DaysBetweenTwoDates {

    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {
        return DAYS.between(LocalDate.of(year, month, day), LocalDate.of(year2, month2, day2));
    }
}
