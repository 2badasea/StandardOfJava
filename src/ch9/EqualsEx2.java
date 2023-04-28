package ch9;

public class EqualsEx2 {

	public static void main(String[] args) {
		Person p1 = new Person(1234);
		Person p2 = new Person(1234);
		
		if(p1 == p2) {
			System.out.println("서로 같은 객체");
		} else {
			System.out.println("서로 다른 객체");
		}
		
		if(p1.equals(p2)) {
			System.out.println("서로 같은 사람");
		}else {
			System.out.println("서로 다른 사람");
		}
	}

}


class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ( (Person)obj).id;
		} else {
			return false;
		}
	}
	
	Person(long id){
		this.id = id;
	}
}