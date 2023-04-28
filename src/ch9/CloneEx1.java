package ch9;

// Cloneable 인터페이스를 구현한 클래스만 clone() 메서드 호출 가능. 
class Point implements Cloneable{
	int x; 
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
	
	// 오버라이딩
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone(); // clone()은 반드시 예외처리 필수
		} catch (CloneNotSupportedException e) {
		}
		return obj;
	}
}

public class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point) original.clone(); // 형변환
		System.out.println(original);
		System.out.println(copy);
	}

}
