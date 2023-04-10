package ch6;

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "Heart";
		c1.cardNumber = 7; 
		
		c2.kind = "Spade";
		c2.cardNumber = 4; 
		
		System.out.println(c1.width);  // 100
		c1.width = 200;
		
		System.out.println(c2.width); // 200
		
	}
	
	public long getNo(float n) {
		return (int)n;
	}
}



class Card{
	static int width = 100;
	static int height = 100;
	int cardNumber;
	String kind;
}