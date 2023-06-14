package ch11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek(); // stack에 저장된 마지막 요소를 읽어온다. 
		
		// stack이 비어있다면 peek()메서드가 EmptyStackException 예외를 발생시킴. 
		// 마지막 요소를 삭제. 배열의 index가 0부터 시작하므로 1을 뺀다. 
		removeElementAt(size() -1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if(len == 0) {
			throw new EmptyStackException();
		}
		// 마지막 요소를 반환. 
		return elementAt(len-1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);
		
		if(i>=0) {
			return size() -i;
		}
		return -1; // 해당 객체를 찾지 못하면 -1을 반환
	}
}
