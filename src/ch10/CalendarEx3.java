package ch10;

import java.util.Calendar;

public class CalendarEx3 {

	public static void main(String[] args) {
		// 상수값을 활용한 set() 호출
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		//  17:32분 설정
		time1.set(Calendar.HOUR_OF_DAY, 17);
		time1.set(Calendar.MINUTE, 32);
		// 23:59분 설정
		time2.set(Calendar.HOUR_OF_DAY, 23);
		time2.set(Calendar.MINUTE, 59);
		
		System.out.println("time1: " + time1.get(Calendar.HOUR_OF_DAY) + "시 " 
							+ time1.get(Calendar.MINUTE) + "분");
		System.out.println("time2: " + time2.get(Calendar.HOUR_OF_DAY) + "시 " 
							+ time2.get(Calendar.MINUTE) + "분"); 
		
		System.out.println("time1과 time2의 차이는 " + Math.abs( time1.getTimeInMillis() - time2.getTimeInMillis()));
		long difference = Math.abs( time1.getTimeInMillis() - time2.getTimeInMillis());
		long hour = difference/(1000*60*60);
		long minute = difference/(1000  *60) - (hour * 60);
		System.out.println("시분으로 환산하면 " + hour + "시" + minute + "분");
		
		
		Calendar date = Calendar.getInstance();
		date.set(2023, 6, 30);
		date.add(Calendar.DATE, 1);
		System.out.println(date.get(Calendar.MONTH) + 1 ); // 7월. month가 변경됨 
		date.roll(Calendar.DATE, 31);  // 31일 이후
		System.out.println(date.get(Calendar.MONTH) + 1); // 그대로 7월. 연산이 일어난 필드값에만 영향을 미친다.
		
		
		
	}
}
