package ch6;

public class ConstructorTest {
		
	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2();  에러. 명시적 생성자가 존재 => 생성자와 매개변수 구성이 같아야 한다.
	}
}

class Data1{
	int value;
	
	// 암묵적으로 기본 생성자가 추가된다.
}

class Data2{
	int value;
	
	// 명시적으로 선언한 생성자
	Data2(int x){
		this.value = x;
	}
}


