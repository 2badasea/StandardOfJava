//package ch12;
//
//import java.util.*;
//
////class Fruit implements Eatable { 
////	public String toString() { return "Fruit"; } 
////}
////class Apple extends Fruit { public String toString() { return "Apple"; } }
////class Grape extends Fruit { public String toString() { return "Grape"; } }
////class Toy { public String toString() { return "Toy"; } };
//
//interface Eatable {}
//
//public class FruitBoxEx2 {
//
//	public static void main(String[] args) {
//		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
//		FruitBox<Apple> appleBox = new FruitBox<Apple>();
//		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
////		FruitBox<Grape> grapeBox = new FruitBox<Apple>();  // 에러. 타입불일치
////		FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러. => Toy는 Fruit와 상속관계가 아니기 때문.
//		
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple());
//		fruitBox.add(new Grape());
//		appleBox.add(new Apple());
////		appleBox.add(new Grape()); // 에러. Grape는 Apple의 자손이 아니기 때문.
//		grapeBox.add(new Grape()); 
//		
//		System.out.println("fruitBox: " + fruitBox);  // [Fruit, Apple, Grape]
//		System.out.println("appleBox: " + appleBox);  // [Apple]
//		System.out.println("grapeBox: " + grapeBox);  // [Grape]
//	}
//}
////class FruitBox<T extends Fruit & Eatable> extends Box<T> { }
////
////class Box<T> {
////	ArrayList<T> list = new ArrayList<T>();
////	
////	void add(T item) { list.add(item); }
////	T get(int i) { return list.get(i); }
////	ArrayList<T> getList() { return list; } 
////	int size() { return list.size(); }
////	public String toString() { return list.toString(); } 
////}