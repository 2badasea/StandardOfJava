package ch7;

class FianlCard {
	final int number;
	final String name;
	static int width = 100;
	static int height = 200;
	
	FianlCard(int number, String name){
		this.number = number;
		this.name = name;
	}
	
	FianlCard(){
		this(1, "SPADE");
	}
	
	public String toString() {
		return "name: " + name + ", number: " + number;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		FianlCard c = new FianlCard(10, "HEART");
//		c.number = 100; 에러가 난다. 인스턴스가 생성되면서 상수값 10을 가짐 
		System.out.println(c.name);
		System.out.println(c.number);
		System.out.println(c);
	}

}



