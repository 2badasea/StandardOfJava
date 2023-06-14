package ch10;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
public class DateFormatEx3 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 d일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2015년 11월 23일");
			System.out.println(d.toString());
			System.out.println(df2.format(d));
		} catch (Exception e) {
			
		}
		System.out.println("==============================");
		
		LocalDateTime dt = LocalDateTime.of(2015, 12,31,12,34,56);
		LocalDate date = dt.toLocalDate(); // LocalDAteTime -> LocalDate
		LocalTime time = dt.toLocalTime(); // LocalDateTime -> LocalTime
		
		
		
		
		
		
	}
	
	
	

}
