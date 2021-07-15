package com.lti.stringmethods;

import java.time.Instant;
import java.time.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateAPI {
	public static void main(String[] args) {
		
		Date tday = new Date();
		System.out.println(tday);
		
		System.out.println("************");
		Instant curTime = Instant.now();
		System.out.println(curTime);
		System.out.println("************");
		
		LocalDate locDate= LocalDate.now();
		System.out.println(locDate);
		System.out.println(locDate.getDayOfMonth());
		System.out.println("Ramzan ID is on "+locDate.withDayOfMonth(30) +" Enjoy it's public holiday");

		System.out.println("************");
		
		ZonedDateTime zoneNow = ZonedDateTime.now();
		System.out.println("Zoned Date Time India: "+zoneNow);

		System.out.println("************");
		
		ZonedDateTime zoneParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Zoned Date Time Paris: "+zoneParis);

		System.out.println("************");
		
		LocalDate currentDate = LocalDate.now();

		LocalDate independanceDay = LocalDate.of(1947,Month.AUGUST,15);
		System.out.println("Independance:"+ independanceDay);

		System.out.println("Today:"+ currentDate);
		System.out.println("Tomorrow:"+ currentDate.plusDays(1));
		System.out.println("Last Month:"+currentDate.minusMonths(1));
		System.out.println("Is Leap?:"+ currentDate.isLeapYear());

		System.out.println("************");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input = scanner.nextLine();
		//Almost every class in java.time package provides parse() method to parse date or time
		LocalDate enteredDate = LocalDate.parse(input,formatter);



		System.out.println("Entered Date:"+ enteredDate);
		scanner.close();
		
	}

}
