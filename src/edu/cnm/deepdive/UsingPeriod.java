package edu.cnm.deepdive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {

  public static void main(String[] args) {
      LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
      LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
      Period period = Period.ofWeeks(1);
//    start.toEpochDay(); number of days since January 1 1970

      cleanAnimalCage(start, end, period);

    System.out.println(start.plus(period));
    System.out.println(LocalDateTime.now().plus(period));

    Period yearAndMonth = Period.ofYears(1).ofMonths(1);//ofYears() and ofMonths() are static methods
    //so this will only print P1M, meaning period of 1 month.
  }

  public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
    while (start.isBefore(end)) {
      System.out.println("Need to clean cage on: " + start);
      start = start.plus(period);
    }
  }

  public static void cleanAnimalCage(LocalDate start, LocalDate end) {
    while (start.isBefore(end)) {
      System.out.println("Need to clean cage on: " + start);
      start = start.plusMonths(1);
    }
  }

}
