package ch6;

class MyMath2 {
	long a;
	long b;
	
	// 인스턴스 변수 a,b만을 이용해서 작업 -> 매개변수 없어도 가능
	long add() { return a + b;} // a,b는 인스턴스 변수 
	long subtract() { return a -b ; }  
	
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능
	static long add(long a, long b) {return a + b;}		// a,b는 지역변수.
	static long subtract(long a, long b) { return a - b;} 
	
	
	public static void main(String[] args) {
		MyMath2.add(3,5); // 클래스 변수는 인스턴스 생성없이 바로 '클래스명.메서드()'로 호출이 가능
		
		// 인스턴스 변수는 인스턴스를 생성해야 호출이 가능. (위에 매개변수가 없는 것이 인스턴스 변수였음)
		MyMath2 mm = new MyMath2();
		mm.add(); 
		
		
	}
}
