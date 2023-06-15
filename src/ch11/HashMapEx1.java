package ch11;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 패스워드를 입력");
			System.out.print("id: ");
			String id = scn.nextLine().trim();
			
			System.out.print("password: ");
			String password = scn.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다.");
				continue;
			}
			
			if( !(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");
				continue;
			}else {
				System.out.println("아이디와 비밀번호가 일치");
				break;
			}
		}
		scn.close();
	}
}
