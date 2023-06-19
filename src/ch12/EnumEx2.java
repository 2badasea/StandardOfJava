package ch12;

enum DirectionEx2 {
	EAST(1, ">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final DirectionEx2[] DIR_ARR = DirectionEx2.values();
	private final int value;
	private final String symbol;
	
	DirectionEx2(int value, String symbol){  // 접근 제어자 private이 생략됨
		this.value = value; 
		this.symbol = symbol;
	}
	
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	
	public static DirectionEx2 of(int dir) {
		if(dir < 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid valuie: " + dir);
		}
		return DIR_ARR[dir-1];
	}
	
	// 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계반대 방향으로 회전
	public DirectionEx2 rotate(int num) {
		num = num % 4;
		
		if(num < 0) num +=4;  // num이 음수일 때는 시계반대 방향으로 회전. 
		
		return DIR_ARR[( value -1 + num) % 4];
	}
	
	public String toString() {
		return name() + getSymbol();
	}
} // enum DirectionEx2

public class EnumEx2 {

	public static void main(String[] args) {
		for(DirectionEx2 d : DirectionEx2.values())
			System.out.printf("%s=%d%n", d.name(), d.getValue());
		
		DirectionEx2 d1 = DirectionEx2.EAST;
		DirectionEx2 d2 = DirectionEx2.of(1); // 
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(DirectionEx2.EAST.rotate(1));
		System.out.println(DirectionEx2.EAST.rotate(2));
		System.out.println(DirectionEx2.EAST.rotate(-1));
		System.out.println(DirectionEx2.EAST.rotate(-2));
	}
}
