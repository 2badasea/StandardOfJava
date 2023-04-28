package ch7;

public class PointTest {

	public static void main(String[] args) {
		Point3D ps = new Point3D(1, 2, 3);
	}

}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: " + x  + ", y: " + y;
	}
}

class Point3D extends Point{
	int z;

	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	// 오버라이딩
	String getLocation() {	
		return "x: " + x + ", y:" + y + ", z: " + z;
	}
	
}
