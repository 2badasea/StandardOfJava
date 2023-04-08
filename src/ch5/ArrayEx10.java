package ch5;

import java.util.Arrays;

public class ArrayEx10 {
	
	public static void main(String[] args) {
		int[] ary = new int[10];
		for(int i = 0; i<10; i++) {
			ary[i] = (int) (Math.random() * 100 -1 + 1) + 1; // 1~100까지의 범위
		}
		System.out.println("sort 전");
		System.out.println(Arrays.toString(ary));
		
		// sort하기
		int tmp;
		boolean change = false;
		for(int i =0; i<ary.length -1; i++) {
			for(int j = 0; j<ary.length -1-i; j++) {
				if(ary[j] > ary[j+1]) {
					tmp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = tmp;
					change = true;
				}
			}
			if(!change) break;
		}
		System.out.println("sort 후");
		System.out.println(Arrays.toString(ary));
		
	
	}
}
