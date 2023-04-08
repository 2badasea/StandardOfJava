package ch5;

import java.util.Scanner;

public class MultiArrEx1 {
	public static void main(String[] args) {
		final int SIZE = 5; 
		int[][] bingo = new int[SIZE][SIZE];
		
		// 값 할당
		int count = 1;
		for(int i = 0; i<bingo.length; i++) {
			for(int j = 0; j<bingo[i].length; j++) {
				bingo[i][j] = count++;
			}
		}
		
		// 셔플 반복횟수 50
		int temp;
		for(int i =0; i<50; i++) {
			int first = (int)(Math.random() * 5);
			int second = (int)(Math.random() * 5);
			
			temp = bingo[0][0];
			bingo[0][0] = bingo[first][second];
			bingo[first][second] = temp;
		}
		
		Scanner scn = new Scanner(System.in);
		int num = 0;
		do {
			for(int i = 0; i<SIZE; i++) {
				for(int j= 0; j<SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("1~25까지의 숫자를 입력하세요");
			String tmp = scn.nextLine();
			num = Integer.parseInt(tmp);
			
			outer:
				for(int i =0; i<bingo.length; i++) {
					for(int j =0; j<bingo[i].length; j++) {
						if(bingo[i][j] == num) {
							bingo[i][j] = 0;
							break outer;
						}
					}
				}
		}while(num != 0);
		
		
		
		
	}

}
