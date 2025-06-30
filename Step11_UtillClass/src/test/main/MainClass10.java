package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		
		// Set 클래스의 of() 라는 static 메소드를 이용해서 read only Set 객체를 만들수도 있다. 
		Set<String> set1 = Set.of("A","B","C","D");
		Set<String> set2 = Set.of("C","D","E","F");
		
		// 중복된 데이터가 들어있는 List 
		List<String> names = List.of("kim", "lee", "park", "lee"); 
		
		// List는 Collection type 이기도 하다 (Collection이 부모 type이다 )
		Collection<String> collec = names; // 다형성 확인 
		
		// HashSet 객체의 생성자에 List를 전달해서 HashSet 객체 생성(중복이 제거 된다)
		Set<String> namesSet = new HashSet<>(names);
		// Set가 List의 중복을 제거하는데도 활용이 된다는 것을 알아두면 됨. 
		
		// ArrayList 객체의 생성자에 Set을 전달해서 ArrayList 객체 생성(인덱스로 관리할 수 있다)
		List<String> names2 = new ArrayList<>(namesSet);
	
	}
}
