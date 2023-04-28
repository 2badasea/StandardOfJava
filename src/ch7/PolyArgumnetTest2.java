package ch7;

import java.util.Vector;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	// 기본 생성자
	Product(){}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	public Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	
	// 길이의 제약이 없는 Vector 컬렉션을 이용
	Vector<Product> item = new Vector<>();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("돈 부족");
			return;
		}
		item.add(p);
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입했습니다~");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 환불했습니다.");
		}else {
			// 제거에 실패한 경우?
			System.out.println("해당 제품은 구입하지 x");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품 없음");
			return;
		}
		
		//구입한 제품이 있는 경우
		for(int i = 0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총 금액: " + sum);
		System.out.println("구입 물품 리스트: " + itemList);
	}
}

public class PolyArgumnetTest2 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(audio);
		b.buy(tv);
		b.buy(com);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}

