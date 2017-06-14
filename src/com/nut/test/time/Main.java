package com.nut.test.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(5, 10);
        localTime = localTime.minus(1, ChronoUnit.HOURS);
        System.out.println(localTime);

        LocalDate localDate = LocalDate.of(1990, Month.MAY, 7);
        localDate = localDate.plusYears(27);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);
    }
}
