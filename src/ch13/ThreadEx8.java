package ch13;

public class ThreadEx8 {

	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		
		th2.setPriority(7);
		
		System.out.println("우선순위th1: " + th1.getPriority());
		System.out.println("우선순위th2: " + th2.getPriority());
		th1.start();
		th2.start();
	}

}

class ThreadEx8_1 extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print("-");
			for(int x = 0; x<1000000; x++);
		}
	}
}
class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i =0; i<300; i++) {
			System.out.print("|");
			for(int x = 0; x<1000000; x++);
		}
	}
}
