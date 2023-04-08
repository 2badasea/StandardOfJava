package ch5;

import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		
		for(int i = 0; i<ary.length; i++) {
			ary[i] = (int)(Math.random() * 10) + 1;
		}
		int[] count = new int[ary.length];
		
		// 숫자가 100번 랜덤 => 빈도수가 얼마나 되는지 체크
		for(int i= 0; i<100; i++) {
			int n = (int)(Math.random() * 10) + 1;
			count[n-1]++;
		}
		// 결과
		System.out.println(Arrays.toString(count));
	}

}
