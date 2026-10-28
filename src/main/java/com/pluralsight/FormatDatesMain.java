package com.pluralsight;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FormatDatesMain {

    public static void main(String[] args) {

        //* Getting current date and time in local time zone
        LocalDateTime currentDateTime = LocalDateTime.now();
        //
        DateTimeFormatter monthDayYear =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter yearDayMonth = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        DateTimeFormatter eDayEMonthYear = DateTimeFormatter.ofPattern("EEEE, MMMM MM, yyyy");
        ZonedDateTime gmtDateTime = currentDateTime.atZone(ZoneId.of("GMT"));
        DateTimeFormatter eDayESMonthYearGMT = DateTimeFormatter.ofPattern("EEEE, MMM MM, yyyy  HH:mm 'GMT'");
        DateTimeFormatter localTimeDayESMonthYear = DateTimeFormatter.ofPattern("HH:mm 'on' MM-MMM-yyyy");

        //TODO: Receive CURRENT date and time & display that information in the following formats:
        //* 04/22/2026
        //* 2026-04-22
        //* Wednesday, April 22, 2026
        //* Wednesday, Apr 22, 2026 10:02 <GMT time
        //TODO: Display current date and time in MM/dd/yyyy
        System.out.println(monthDayYear.format(currentDateTime));
        //TODO: Display current date and time in yyyy/dd/MM
        System.out.println(yearDayMonth.format(currentDateTime));
        //TODO: Display current date and time in Day of Week, Month & #Day, Year
        System.out.println(eDayEMonthYear.format(currentDateTime));
        //TODO: Display current date and time in Day of Week, Abbrv Month & #Day, Year  timeInGMT
        System.out.println(eDayESMonthYearGMT.format(gmtDateTime));
        //TODO: Then, display 5:02 on 22-Apr-2026 format in my local time zone
        System.out.println(localTimeDayESMonthYear.format(gmtDateTime));
    }

}
