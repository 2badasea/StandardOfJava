package ch7;

public class InnerEx2 {

	class InstanceInner{}
	static class StaticInner{}
	
	// 인스턴스멤버 간에는 서로 직접 접근이 가능
	InstanceInner iv = new InstanceInner();
	// static 멤버 간에는 서로 직접 접근이 가능 
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static 멤버는 인스턴스 멤버에 접근 불가
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		
		// super연산자를 통해서 호출할 수 있음에도, 형변환을 통해서 호출하는 이유? 
		
		// 굳이 접근하려면 아래와 같이 객체를 생성
		// 인스턴스 클래스는 외부 클래스를 먼저 생성해야 생성 가능
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		// 인스턴스 메서드에서는 인스턴스 멤버와 static멤버 모두 접근이 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner ojb2 = new StaticInner();
		// 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 불가
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
