package ch10;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		// 기본적으로 현재 날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		
		System.out.println(today.get(Calendar.YEAR)); // 올해 연도 
		System.out.println(today.get(Calendar.MONTH)); // 월 (0~11로 표현됨. 실제값은 +1) 
		System.out.println(today.get(Calendar.WEEK_OF_YEAR)); // 올해 몇 째 주
		System.out.println(today.get(Calendar.WEEK_OF_MONTH)); // 이번 달의 몇 째 주
		
		System.out.println(today.get(Calendar.DATE)); // 이번 달 며칠
		System.out.println(today.get(Calendar.DAY_OF_MONTH)); // 이번 달 며칠
		
		System.out.println(today.get(Calendar.DAY_OF_YEAR)); // 올해의 며칠 째
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 1~7, 1: 일요일 7 : 토요일 
		
		System.out.println(today.get(Calendar.HOUR)); // 0~11 시간
		System.out.println(today.get(Calendar.HOUR_OF_DAY)); // 0~23 시간 
		System.out.println(today.get(Calendar.MINUTE)); // 분
		System.out.println(today.get(Calendar.SECOND)); // 초
	}
}
