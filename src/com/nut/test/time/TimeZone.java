package com.nut.test.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TimeZone {
    public static void main(String[] args) {
        class TimeZone2 {
            private String region;
            private String specificArea;

            public TimeZone2(String nonFormattedTz) {
                String region = "";
                String specificArea = "";
                try {
                    region = nonFormattedTz.split("/")[0];
                    specificArea = nonFormattedTz.split("/")[1];
                } catch (ArrayIndexOutOfBoundsException e) {

                }
                this.region = region;
                this.specificArea = specificArea;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public String getSpecificArea() {
                return specificArea;
            }

            public void setSpecificArea(String specificArea) {
                this.specificArea = specificArea;
            }

            @Override
            public String toString() {
                return getSpecificArea();
            }
        }
        LocalTime localTime = LocalTime.of(5, 10);
        localTime = localTime.minus(1, ChronoUnit.HOURS);

        LocalDate localDate = LocalDate.of(1990, Month.MAY, 7);
        localDate = localDate.plusYears(27);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        Map<String, List<TimeZone2>> mapTz = zoneIds.stream()
            .sorted()
            .map(TimeZone2::new)
            .collect(Collectors.groupingBy(TimeZone2::getRegion));

        /*mapTz.forEach((key, value) -> value.stream().sorted(Comparator.comparing(TimeZone2::getRegion))
            .forEach(timeZone2 -> System.out.println(timeZone2.getSpecificArea())));*/

        System.out.println(mapTz);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Jakarta"));
        //System.out.println(zonedDateTime);

        Period period = Period.between(localDateTime.toLocalDate(), localDateTime.toLocalDate().plusDays(32));
        System.out.println(period.getDays() + " day " + period.getMonths() + " month " + period.getYears() + " year");

        Duration duration = Duration.between(localDateTime, localDateTime.plusHours(1));
        System.out.println(duration.getSeconds());

        String formatDateTime = localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(formatDateTime);
        String formatDateTime2 = localDateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(formatDateTime2);
    }
}
