package ch9;

import java.util.Scanner;

public class IndexOfCh9 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("회원가입 받음 최소6자 이상");
		String id = scn.nextLine();
		
		if( id.contains(" ")) {
			System.out.println("공백이 존재");
		} else {
			System.out.println("공백없음");
		}
		
		
	}

}
