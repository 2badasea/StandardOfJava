package ch12;

enum DirectionEx1 {
	EAST, SOUTH, WEST, NORTH;
}

public class EnumEx1 {

	public static void main(String[] args) {
		DirectionEx1 d1 = DirectionEx1.EAST;
		DirectionEx1 d2 = DirectionEx1.valueOf("WEST");
		DirectionEx1 d3 = Enum.valueOf(DirectionEx1.class, "EAST");

		System.out.println("d1: " + d1); // EAST
		System.out.println("d2: " + d2); // WEST
		System.out.println("d3: " + d3); // EAST

		System.out.println("d1 == d2 : " + (d1 == d2)); // false
		System.out.println("d1==d3 : " + (d1 == d3)); // true
		System.out.println("d1.equals(d3) : " + (d1.equals(d3))); // true
//		System.out.println("d2 > d3 : " + (d1>d3)); // 에러. 열거형 상수간에는 비교연산자 사용 불가
		System.out.println("d1.comopareTo(d3) : " + (d1.compareTo(d3))); // 0
		System.out.println("d1.compareTo(d2) : " + (d1.compareTo(d2))); // -2

		switch (d1) {
		case EAST: // DirectionEx1.EAST라고 쓸 수 없다.
			System.out.println("DirectionEx1 is EAST");
			break;
		case SOUTH:
			System.out.println("directio is SOUTH");
			break;
		case WEST:
			System.out.println("DirectionEx1 is WEST");
			break;
		case NORTH:
			System.out.println("DirectionEx1 is NORTH");
			break;
		default:
			System.out.println("Invalid DirectionEx1");
			break;
		}

		DirectionEx1[] dArr = DirectionEx1.values();

		for (DirectionEx1 d : dArr) { // for(DirectionEx1 d : DirectionEx1.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
		}
	}
}
