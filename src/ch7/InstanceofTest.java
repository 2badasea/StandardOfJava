package ch7;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine4 fe4 = new FireEngine4();
		
		if(fe4 instanceof FireEngine4) {
			System.out.println("this FireEngine instance");
		}
		
		if(fe4 instanceof Car4) {
			System.out.println("this Car instance");
		}
		
		if(fe4 instanceof Object) {
			System.out.println("this is Object instance");
		}
		
		System.out.println(fe4.getClass().getName());
	}

}

class Car4{};
class FireEngine4 extends Car4{};