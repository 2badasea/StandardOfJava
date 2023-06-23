package ch14;

import java.util.*;

public class RambdaReview {

	public static void main(String[] args) {
		// 람다식을 활용 removeIf, replaceAll, forEach,

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}

		// 모든 요소를 조회
		list.forEach(fuck -> {
			if (fuck.equals(19) == true) {
				System.out.print(fuck);
			} else {
				System.out.print(fuck + ", ");
			}
		});
		System.out.println();
		
		// list에서 2 또는 3의 배수를 제거. 
		list.removeIf( i -> i%2 == 0 || i%3 == 0);
		System.out.println(list);
		
		// replaceAll 
		list.replaceAll( i -> i*i);
		System.out.println(list);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("bada", 8448);
		map.put("seulbi", 9662);
		map.put("sujeong", 3811);
		
		map.forEach( (K, V) -> {
			System.out.println("key: " + K + ", value: " + V);
		});
	}
}
