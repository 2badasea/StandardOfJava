package ch5;

import java.util.Arrays;

public class IndexOfChapter05 {

	public static void main(String[] args) {
		
		final int X = 10;
		final int Y = 10; 
		
		int[][] ary = new int[X][Y]; 
		
		// 2차원 배열 행의 길이는  배열이름.length
		int count = 1;
		for(int i = 0; i<ary.length; i++) {
			for(int j= 0;  j<ary[i].length; j++) {
				ary[i][j] = count++;
				System.out.print(ary[i][j]+ ", ");
			}
			System.out.println();
		}
		
		// 향상된 for문을 활용해서 2차원 배열의 모든 요소의 합(sum) 구하기
		int sum = 0;
		for(int[] miniAry : ary) {
			for(int s : miniAry) {
				sum += s;
			}
		}
		System.out.println("합: " + sum);
		
	}

}
