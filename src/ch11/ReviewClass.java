package ch11;

import java.util.Arrays;
import java.util.List;

public class ReviewClass {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4};
		int[] arr2 = Arrays.copyOf(arr, arr.length); //  {0,1,2,3,4}
		int[] arr3 = Arrays.copyOf(arr, 3); // {0,1,2}
		int[] arr4 = Arrays.copyOf(arr, 7); // {0,1,2,3,4,0,0}
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // {2,3}
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // {0,1,2,3,4,0,0}
		
		
		List list = Arrays.asList(new Integer[] {1,2,3,4,5});  // {1,2,3,4,5}
		List list2 = Arrays.asList(1,2,3,4,5);		// {1,2,3,4,5}
		list.add(6);   // 에외가 발생. 
		
	}

}
