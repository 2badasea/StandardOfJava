package ch7;

public class PolyArgumnetTest {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		System.out.println("현재 남은 돈: " +  b.money);
		System.out.println("현재 보너스: " + b.bonusPoint);
	}

}

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int) (price/10.0); 
		
	}
}

class Tv2 extends Product2{
	Tv2(){
		super(100); 
	}
	public String toString() {
		return "Tv2";
	}
}

class Buyer2{
	int money = 10000;
	int bonusPoint = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("돈부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을 구입");
	}
}
