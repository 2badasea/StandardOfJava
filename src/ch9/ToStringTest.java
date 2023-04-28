package ch9;

public class ToStringTest {

	public static void main(String[] args) {
		
		String str = new String("leebada java");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println();
		System.out.println(today);
		System.out.println(today.toString());
		
	}

}
