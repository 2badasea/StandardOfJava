package ch7;

public class InnerEx6 {

	Object iv = new Object() { // 익명 클래스
		void method() {
		}
	}; // 익명 클래스

	static Object cv = new Object() { // 익명 클래스
		void method() {
		}
	};

	void myMethod() {				// 익명 클래스
		Object lv = new Object() {
			void method() {
			}
		};
	}
}