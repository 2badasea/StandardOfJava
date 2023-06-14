package ch10;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateFormatterEx1 {

	public static void main(String[] args) {
		ZonedDateTime zDateTime = ZonedDateTime.now();
		
		String[] patternArr = {
				"yyyy-MM-dd HH:mm:ss",
				"yyyy-MM-dd hh:mm:ss a"
		};
		
		for(String p : patternArr) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
			System.out.println(zDateTime.format(formatter));
		}
	}
}
