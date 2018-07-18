package com.higgsup.java.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {

    public static void main(String[] args) {
        //Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date="+today);

        //Creating LocalDate by providing input arguments
        LocalDate firstDay_2018 = LocalDate.of(2018, Month.JULY, 18);
        System.out.println("Specific Date="+firstDay_2018);


        //Current date in "Asia/Ho_Chi_Minh", you can get it from ZoneId javadoc
        LocalDate todayHoChiMinh = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Current Date in IST="+todayHoChiMinh);


        //Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= "+dateFromBase);

        //Getting dayOfYear days first in year
        LocalDate hundredDay2018 = LocalDate.ofYearDay(2018, 100);
        System.out.println("100th day of 2018="+hundredDay2018);
    }
}
