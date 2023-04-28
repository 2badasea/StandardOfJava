package ch7;

public class PracticeTest {
	
	public static void main(String[] args) {
		Novel book1 = new Novel("java의정석", "남궁성", 23000);
		book1.methodA();
		Book book3 = new Book("book", "booK", 10000);
		book3.methodA();
		System.out.println("위에만 확인");
		Book book2 = new ComicBook("원피스", "오다", 8000);
		book2.summary();
		
		Book.methodA();
		Novel.methodA();
		
	}

}

// 다형성에 대한 예시
class Book{
	private String name;
	private String writer;
	private int price;
	
	static void methodA() {
		System.out.println("부뫀를래스 메서드");
	}
	
	Book(String name, String writer, int price){
		this.name = name;
		this.writer = writer;
		this.price = price;
	}
	
	 void summary() {
		System.out.println("name: " + name + ", writer: " + writer + ", price: " + price);
	}
}

class Novel extends Book{
	
	Novel(String name, String writer, int price) {
		super(name, writer, price);
	}
	
	static void methodA() {
		System.out.println("자식클래스 메서드");
	}
}

class ComicBook extends Book{
	ComicBook(String name, String writer, int price){
		super(name, writer, price);
	}
	@Override
	void summary() {
//		super.summary();
		System.out.println("책이름??? ");
	}
}
