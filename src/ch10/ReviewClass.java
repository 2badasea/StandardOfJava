package ch10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ReviewClass {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 6, 12);
		LocalTime time = LocalTime.of(23, 59, 59);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		String ISO_LOCAL_DATE = date.format(DateTimeFormatter.ISO_LOCAL_DATE); // "2023-06-12";
		System.out.println("ISO_LOCAL_DATE : " + ISO_LOCAL_DATE );
		
		String ISO_LOCAL_TIME = time.format(DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("ISO_LOCAL_TIME: " + ISO_LOCAL_TIME); 
		
		String ISO_DATE_TIME = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("ISO_DATE_TIME: " + ISO_DATE_TIME);
		
		String ISO_LOCAL_DATE_TIME = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("ISO_LOCAL_DATE_TIME: " + ISO_LOCAL_DATE_TIME);
		
		
	}
	
}
