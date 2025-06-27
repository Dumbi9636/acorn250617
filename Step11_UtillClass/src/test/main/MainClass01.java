package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		// java 에서 배엻은 용도가 한정되어 있다. item을 담을 수 있는 공간을 늘이거나 줄일 수 없다.
		// 그래서 util class를 이용해야한다 
		
		// 문자열(String) type 을 담을 수 있는 방 5개짜리 배열 객체 생성
		String[] names = new String[5];
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";
		
		// 아이템을 갯수 상관없이 필요에 따라 마음대로 추가하거나 제거할 수 있는 배열목록(ArrayList) 객체 생성하기
		ArrayList<String> friends = new ArrayList<>();
		
		// 김구라, 해골, 원숭이를 순서대로 담아보세요( 3줄 코딩) 
		friends.add("김구라"); 
		friends.add("해골");
		friends.add("원숭이");
		System.out.println(friends);
		
		// 0번방의 아이템을 불러와서 item 이라는 변수에 담기 
		String item = friends.get(0);
		System.out.println(friends);
		
		// 1번방의 아이템을 삭제
		friends.remove(1); // 이거도 가능한 메서드가 존재한다 friends.remove("김구라");
		System.out.println(friends);
		
		// 저장된 아이템의 갯수(size)를 size라는 지역 변수에 담기
		int size = friends.size();
		
		// 0번방에 "에이콘"을 끼워넣기
		// 개수와 타입을 맞추면 메소드를 다중 정의할 수 있다. (오버로딩 되어 있다) 
		friends.add(0, "에이콘");
		System.out.println(friends);
		
		// 저장된 모든 아이템 전체 삭제 
		friends.clear();
		System.out.println(friends);
	
		// 2번방의 item을 "신현호"로 수정 
		friends.set(2, "신현호");
		
	}
}
