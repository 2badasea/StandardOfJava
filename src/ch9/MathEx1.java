package ch9;

import java.util.Objects;
import java.util.Scanner;

public class MathEx1 {

	public static void main(String[] args) {
		Integer i1 = Integer.parseInt("100");  
		Integer i2 = Integer.parseInt("100");
		System.out.println(i2.equals(i2));   // true
		System.out.println(i1.toString());   // 100
		
		System.out.println("==================");
		
		String test = "1234   5 678  ";
		System.out.println(test.length());
		test = test.replace(" ", "");
		System.out.println(test);
		System.out.println(test.length());
	
	}

}
