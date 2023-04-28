package ch9;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb? : " + (sb == sb2));
		System.out.println("sb.equals(sb2) ?  " + (sb.equals(sb2)));
		
		// StringBuffer 클래스의 문자열을 비교하기 위해서는 2가지 단계
		String s= sb.toString();
		String s2 = sb2.toString();
		
		System.out.println(s.equals(s2));  // true
		
		
		// 잠시 테스트. 3.141592 를 소수점 셋째자리 까지 반올림한 결과 알아보기
		double test = 3.141592;
		System.out.println("result: " + (Math.round(test * 100)/100.0));
		
	}

}
