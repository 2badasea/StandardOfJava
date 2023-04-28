package ch7;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


abstract class Unit{
	int x;
	int y;
	abstract void move(int x, int y);
	void stop() {};
}

class Marine extends Unit{
	void move(int x, int y) {
		// 지정된 위치로 이동
	}
	void stimPack() {
		System.out.println("스팀팩 사용");
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("움직이자~");
	}
	void changeMode() {
		System.out.println("시저모드");
	}
}
class DropShip extends Unit{
	void move(int x, int y) {
		System.out.println("공중에서 움직임");
	}
	void load() {};
	void unload() {};
}