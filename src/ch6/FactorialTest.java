package ch6;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);

	}
	
	static int factorial(int n) {
		// 우선 static 클래스 변수이기에, 인스턴스를 생성하지 않아도 호출 가능
		int answer = 0;
		if(n == 1) {
			return 1;
		}
		answer += n * factorial(n-1);
		
		return answer;   //24
	}

}
