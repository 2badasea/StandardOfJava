package ch6;

public class IndexOfChapter06 {

	public static void main(String[] args) {
		Member bada = new Member("이바다");
		Member seulbi = new Member("이슬비");
		
		bada.today();
	}
	
}

class Member{
	
	String name;  // 인스턴스 변수
	
	int[] lotto = new int[6];
	
	{
		for(int i = 0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45 -1 + 1) + 1;
		}
	}
	Member(String name) {
		this.name = name; 
		
		System.out.println("이름: " + this.name);
		
		for(int i =0; i<lotto.length; i++) {
			System.out.println("lotto[" + (i+1) + "]=" + lotto[i] );
		}
	}
	
	void today() {
		System.out.println(this.name + " 화이팅");
	}
}