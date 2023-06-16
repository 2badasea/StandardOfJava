package ch12;

import java.util.*;

public class ReviewClass {

	public static void main(String[] args) {
		Box<String> b = new Box<>();
		
		b.add("abc");
		System.out.println(b.getList());
	}	
	
	static class Box<T> {
		
		ArrayList<T> list = new ArrayList<T>();
		
		void add(T item) { list.add(item); }
		T get(int i) { return list.get(i); }
		ArrayList<T> getList() { return list; } 
		int size() { return list.size(); }
		public String toString() { return list.toString(); } 
	}
}

