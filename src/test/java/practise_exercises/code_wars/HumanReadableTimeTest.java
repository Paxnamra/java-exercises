package practise_exercises.code_wars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Human Readable Time tests using JUnit5")
public class HumanReadableTimeTest {
    
    @Test
    @DisplayName("When seconds don't turn into minutes")
    void makeReadable_seconds0_returns00ForAllTimeUnits() {
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime.makeReadable(0));
    }

    @Test
    @DisplayName("When seconds turn into minutes")
    void makeReadable_seconds60_returns01Minutes() {
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));
    }

    @Test
    @DisplayName("When seconds input is 86399 seconds")
    void makeReadable_seconds86399_returnsMaxTimeUnitValues() {
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));
    }

    @Test
    @DisplayName("When seconds input is 359999 seconds")
    void makeReadable_seconds359999_returnsUnrealHoursValue() {
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime.makeReadable(359999));
    }
}
