package ch11;

import java.util.*;

public class HashMapEx3 {
	
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "1111");
		addPhoneNo("친구", "김자바", "2222");
		addPhoneNo("친구", "김자바", "3333");
		addPhoneNo("회사", "김대리", "4444");
		addPhoneNo("회사", "김대리", "5555");
		addPhoneNo("회사", "박대리", "6666");
		addPhoneNo("회사", "이과장", "7777");
		addPhoneNo("세탁", "이세탁", "8888");
		addPhoneNo("기타", "이기타", "9999");
		
		printList();
	} // main
	
	// 그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	// 그룹을 추가하는 메서드
	static void addGroup(String groupName) {
		if( !phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			
			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	} // printList
} // class
