package ch8;

import java.util.Scanner;

public class IndexOfCh8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("아이디를 입력하세요");
				String name = scn.nextLine();
				System.out.println("비밀번호를 입력하세요");
				String password = scn.nextLine();
				memberJoin(name, password);
				// 정상적으로 입력되었다면 while문 종료
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage() + " 다시 입력 ㄱㄱ");
				e.printStackTrace();
			}
		}
		scn.close();
		
	}
	
	static void memberJoin(String name, String password) throws Exception {
		
		if(name.length() < 4 || password.length() < 6) {
			throw new Exception("올바르지 않은 형식입니다. 다시 입력하세요");
		}
		
		MemberDTO member = new MemberDTO(name, password);
		// 정상적으로 입력되었다면, 정보가 출력된다. 
		member.myInfo();
		
	}
}

class MemberDTO{
	private final String name;
	private final String password;
	
	public MemberDTO(String name, String password) {
		this.name  =name;
		this.password = password;
		
	}
	
	public void myInfo() {
		String message = "";
		message += "나의 이름: " + this.name + ",  비밀번호: ";
		message += this.password + " 입니다.";
		
		System.out.println(message);
	}
}