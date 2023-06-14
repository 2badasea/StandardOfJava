package ch10;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar myBirthday = Calendar.getInstance();
		
		// set() 메서드를 통한 원하는 날짜 설정
		myBirthday.set(2023, 8 ,3);
		// toString() 오버라이딩해서 날짜 정보 출력
		System.out.println("myBirthday는 " + toString(myBirthday));
		
		// 두 날짜의 차이 구하기 getTimeInMillis() 활용
		Calendar today = Calendar.getInstance();
		long todays = today.getTimeInMillis();
		long birthDays = myBirthday.getTimeInMillis();
		
		long remainDays = (birthDays - todays) / (1000 * 60 * 60 * 24);
		System.out.println("getTimeInMillis() 활용 남은 일: " + remainDays); 
		
		// 다른 방식으로 구하기 DAY_OF_YEAR 상수값 활용 => 
		long birthDays2 = myBirthday.get(Calendar.DAY_OF_YEAR);
		long todays2 = today.get(Calendar.DAY_OF_YEAR);
		System.out.println("남은 일(DAY_OF_YEAR 활용) : " + (birthDays2 - todays2));
		// DAY_OF_YEAR 상수를 통한 값은 '일 단위' 차이를 나타내기 때문에 정확한 값은 -1을 해주어야 한다. 
		System.out.println("DAY_OF_YEAR을 활용한 정확한 값: " + (birthDays2 - todays2 -1));
	}
		
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) +1) +
					"월 " + date.get(Calendar.DATE) + "일 입니다.";
	}
}
