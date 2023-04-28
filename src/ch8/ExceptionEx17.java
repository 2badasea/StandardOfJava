package ch8;

public class ExceptionEx17 {

	public static void main(String[] args) {
		try {
			method1(); 
		}catch(Exception e) {
			System.out.println("main메서드 내에서 예외를 처리했습니다.");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		}catch (Exception e) {
			System.out.println("method1 내에서 예외를 처리했습니다.");
			throw e;			// 예외를 다시 발생시킨다.
		}
	}

}
