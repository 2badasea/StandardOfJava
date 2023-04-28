package ch9;

public class StringEx7 {

	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		// fullName에서 . 의 위치 찾기
		int index = fullName.indexOf('.');
		
		// fullName의 첫 번째부터 .앞까지의 문자열 추출
		String fileName = fullName.substring(0, index);
		System.out.println("파일이름: " + fileName);
		
		// fullName의 . 다음부터 끝까지 문자열 추출
		String ext = fullName.substring(index + 1, fullName.length());
		System.out.println("확장자: " + ext);
	}

}
