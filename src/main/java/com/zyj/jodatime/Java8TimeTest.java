package com.zyj.jodatime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

public class Java8TimeTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());

        System.out.println("-----------------------");

        LocalDate localDate2 = LocalDate.of(2018, 10, 8);
        System.out.println(localDate2);

        System.out.println("-----------------------");

        LocalDate localDate3 = LocalDate.of(2016, 4, 5);
        MonthDay monthDay = MonthDay.of(localDate3.getMonth(), localDate3.getDayOfMonth());
        MonthDay monthDay2 = MonthDay.from(LocalDate.of(2018, 5, 5));

        System.out.println(monthDay.equals(monthDay2));

        System.out.println("-----------------------");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime2 = localTime.plusHours(2).plusMinutes(10);
        System.out.println(localTime2);

        System.out.println("-----------------------");

        LocalDate localDate4 = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate4);

        LocalDate localDate5 = localDate.minus(2, ChronoUnit.MONTHS);
        System.out.println(localDate5);

        System.out.println("-----------------------");

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());

        System.out.println("-----------------------");

        Set<String> set = ZoneId.getAvailableZoneIds();
        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(set);
        treeSet.forEach(System.out::println);

        System.out.println("-----------------------");

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);

        System.out.println("-----------------------");

        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth.isLeapYear());
        System.out.println(yearMonth.lengthOfYear());

        System.out.println("-----------------------");

        LocalDate localDate6 = LocalDate.now();
        LocalDate localDate7 = LocalDate.of(2022, 2, 3);
        Period period = Period.between(localDate6, localDate7);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("-----------------------");
        System.out.println(Instant.now());
    }
}
