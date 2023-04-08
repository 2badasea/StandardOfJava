package ch5;

import java.util.Scanner;

public class MultiArrEx04 {
	
	// 영어단어 맞추기
	public static void main(String[] args) {
		String[][] words = new String[][] {
			{"computer", "의자"},
			{"book", "책"},
			{"chiar", "의자"},
			{"cap", "모자"},
			{"phone", "폰"},
			{"pencil", "연필"},
			{"study", "공부"},
			{"java", "자바"},
			{"cup", "컵"},
			{"car", "차"}
		};
		
		int num = 0; 
		Scanner scn = new Scanner(System.in);
		
		do {
			System.out.println("1~ 10번호를 고르세요. 0누르면 종료");
			String select = scn.nextLine();
			num = Integer.parseInt(select);
			if(num != 0) {
				System.out.println("문제: " + words[num][0] + " 의 뜻은?");
				String answer = scn.nextLine();
				if(answer.equals(words[num][1])) {
					System.out.println("정답!");
				} else {
					System.out.println("틀림");
				}
			}
		}while(num !=0);
	}

}
