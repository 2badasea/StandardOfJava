package ch12;

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
	static int id = 0; 
	int ordinal; 
	String name = "";
	
	public int ordinal() { return ordinal; } 
	
	MyEnum(String name){
		this.name = name;
		ordinal = id++;
	}
	
	public int compareTo(T t) {
		return ordinal - t.ordinal();
	}
}

abstract class MyTransfortation extends MyEnum {
	static final MyTransfortation BUS = new MyTransfortation("BUS", 100) {
		int fare(int distance) { return distance * BASIC_FARE; } 
	};
	static final MyTransfortation TRAIN = new MyTransfortation("TRAIN", 100) {
		int fare(int distance) { return distance * BASIC_FARE; } 
	};
	static final MyTransfortation SHIP = new MyTransfortation("SHIP", 100) {
		int fare(int distance) { return distance * BASIC_FARE; } 
	};
	static final MyTransfortation AIRPLANE = new MyTransfortation("AIRPLANE", 100) {
		int fare(int distance) { return distance * BASIC_FARE; } 
	};
	
	abstract int fare(int distance); // 추상 메서드
	
	protected final int BASIC_FARE; 
	
	private MyTransfortation(String name, int basicFare) {
		super(name);
		BASIC_FARE = basicFare;
	}
	
	public String name() { return name;}
	public String toString() { return name;}
}

public class EnumEx4 {
	public static void main(String[] args) {
		MyTransfortation t1 = MyTransfortation.BUS;
		MyTransfortation t2 = MyTransfortation.BUS;
		MyTransfortation t3 = MyTransfortation.TRAIN;
		MyTransfortation t4 = MyTransfortation.SHIP;
		MyTransfortation t5 = MyTransfortation.AIRPLANE;
		
		System.out.printf("t1=%s, %d%n", t1.name(), t1.ordinal());
		System.out.printf("t2=%s, %d%n", t2.name(), t2.ordinal());
		System.out.printf("t3=%s, %d%n", t3.name(), t3.ordinal());
		System.out.printf("t4=%s, %d%n", t4.name(), t4.ordinal());
		System.out.printf("t5=%s, %d%n", t5.name(), t5.ordinal());
		System.out.println("t1==t2 ? " + (t1==t2));
		System.out.println("t1.compareTo(t3)=" + t1.compareTo(t3)); 
	}
}
