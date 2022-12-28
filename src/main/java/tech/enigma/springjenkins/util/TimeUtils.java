package tech.enigma.springjenkins.util;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

@Slf4j
public class TimeUtils {

    public static boolean isValidDateTimeString(String s, DateTimeFormatter dateTimeFormatter) {
        try {
            LocalDateTime.parse(s, dateTimeFormatter.withResolverStyle(ResolverStyle.STRICT));
        }
        catch (Exception e) {
            log.error("[ERROR] Find invalid datetime string {}", s, e);
            return false;
        }
        return true;
    }

}
