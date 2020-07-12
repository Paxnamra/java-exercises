package practise_exercises.code_wars;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
 * <p>
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * <p>
 * The maximum time never exceeds 359999 (99:59:59)
 * You can find some examples in the test fixtures.
 */

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        NumberFormat formatTime = new DecimalFormat("00");

        int inHours = seconds / 3600;
        int inMinutes = (seconds % 3600) / 60;
        int inSeconds = seconds % 60;

        return formatTime.format(inHours) + ":" + formatTime.format(inMinutes) + ":" + formatTime.format(inSeconds);
    }
}
