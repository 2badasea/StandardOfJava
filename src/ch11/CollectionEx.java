package ch11;

import java.util.*; 
import static java.util.Collections.*;

public class CollectionEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);  // [] 
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);  // [1, 2, 3, 4, 5]
		
		rotate(list, 2); // 오른쪽으로 두 칸 이동
		System.out.println(list);  // [4, 5, 1, 2, 3]
		
		swap(list, 0, 2); // 첫 번째와 세 번째를 교환
		System.out.println(list);  // [1, 5, 4, 2, 3]
		
		shuffle(list); // 저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list, reverseOrder()); // 역순 정렬 reverser(list)와 동일 
		System.out.println(list);  // [5, 4, 3, 2, 1]
		
		sort(list); // 정렬
		System.out.println(list); //[1, 2, 3, 4, 5]
		
		int idx = binarySearch(list, 3); // 3이 저장된 위치(index)를 반환
		System.out.println("index of 3: " + idx);
		
		System.out.println("max: " + max(list));
		System.out.println("min: " + min(list));
		System.out.println("min: " + max(list, reverseOrder())); 
		
		fill(list,9); // 9로 채운다
		System.out.println(list);  // [9, 9, 9, 9, 9]

		// list와 같은 크기의 새로운 List를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(), 2); 
		System.out.println(newList);  // [2, 2, 2, 2, 2] 
		
		System.out.println(disjoint(list, newList)); // 공통요소가 없다면 true
		
		copy(list,newList);
		System.out.println("newList: " + newList);  // [2, 2, 2, 2, 2]
		System.out.println("list: " + list);  //[2, 2, 2, 2, 2]
		
		replaceAll(list, 2, 1);
		System.out.println("replace 이후 list: " + list); // [1, 1, 1, 1, 1]
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2: " + list2);  //list2: [1, 1, 1, 1, 1]
	}
}
