package practise_exercises.code_wars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DaysBetweenTwoDatesTest {

    @Test
    public void getDaysAlive() throws Exception {
        assertEquals(5021, DaysBetweenTwoDates.getDaysAlive(1987, 1, 16, 2000, 10, 15));
        assertEquals(4179, DaysBetweenTwoDates.getDaysAlive(2005, 10, 27, 2017, 4, 6));
        assertEquals(3832, DaysBetweenTwoDates.getDaysAlive(1998, 1, 10, 2008, 7, 8));
    }}
