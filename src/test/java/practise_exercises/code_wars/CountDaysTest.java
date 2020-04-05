package practise_exercises.code_wars;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.*;

public class CountDaysTest {

    @Test
    public void countDays() {
        CountDays days = new CountDays();
        assertEquals("The day is in the past!", days.countDays(new Date(2000-1900, 12, 24)));
        assertEquals("Today is the day!", days.countDays(new Date()));
    }
}
