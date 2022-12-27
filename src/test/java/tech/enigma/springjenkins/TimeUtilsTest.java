package tech.enigma.springjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tech.enigma.springjenkins.util.TimeUtils;

import java.time.format.DateTimeFormatter;

public class TimeUtilsTest {

    @Test
    public void testIsValidDateTimeStringTrue() {
        Assertions.assertTrue(TimeUtils.isValidDateTimeString("20140121114514",
                DateTimeFormatter.ofPattern("uuuuMMddHHmmss")));
    }

    @Test
    public void testIsValidDateTimeStringFalse() {
        Assertions.assertFalse(TimeUtils.isValidDateTimeString("20140121114514", DateTimeFormatter.ISO_DATE_TIME));
    }

}
