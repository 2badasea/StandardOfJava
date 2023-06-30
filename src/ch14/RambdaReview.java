package ch14;

import java.util.Arrays;

public class RambdaReview {

	public static void main(String[] args) {
		// 익명 객체의 메서드를 정의. 
		
	}
	
	BadaFunction bada() {
//		BadaFunction f = () -> System.out.println("테스트");
//		return f;
		return () ->  System.out.println("테스트2");  
	}
	
}



// 함수형 인터페이스라고 선언
@FunctionalInterface
interface BadaFunction {
	void bada();
}