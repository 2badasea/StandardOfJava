package ch12;

enum Transfortation {
	BUS(100) { int fare(int distance) { return distance * BASIC_FARE; }},
	TRAIN(150) { int fare(int distance) { return distance * BASIC_FARE; }},
	SHIP(100) { int fare(int distance) { return distance * BASIC_FARE; } },
	AIRPLANE(300) { int fare(int distance) { return distance * BASIC_FARE;}};
	
	// protected로 해야 각 상수에서 접근이 가능(추상 메서드를 구현하기 위해선 접근이 필요하다)
	protected final int BASIC_FARE;  
	
	// 열거형 상수의 생성자는 private이 묵시적으로 생략되어 있음
	Transfortation(int basicFare){ // private Transfortation(int basicFare).
		BASIC_FARE = basicFare;
	}
	
	public int getBasicFare() { return BASIC_FARE; }
	
	abstract int fare(int distance); // 거리에 따른 요금 계산
}

public class EnumEx3 {

	public static void main(String[] args) {
		System.out.println("bus fare=" + Transfortation.BUS.fare(100));
		System.out.println("train fare=" + Transfortation.TRAIN.fare(100));
		System.out.println("ship fare=" + Transfortation.SHIP.fare(100));
		System.out.println("airplane fare=" + Transfortation.AIRPLANE.fare(100));
	}
}
