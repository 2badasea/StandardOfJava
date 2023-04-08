package ch5;

import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		// 1~10까지 할당
		for(int i = 0; i<ary.length; i++) {
			ary[i] = i + 1;
		}
		
		for(int i= 0; i<10; i++) {
			int n =  (int)(Math.random() * 10) + 1;
			System.out.println("n값: " + n);
			int tmp = ary[0];
			ary[0] = ary[n];
			ary[n] = tmp;
		}
		
		// 결과 확인
		System.out.println(Arrays.toString(ary));
		
		

	}

}
