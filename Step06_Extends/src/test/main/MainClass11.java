package test.main;

import test.mypac.Item;

public class MainClass11 {
	public static void main(String[] args) {
		// Item 객체 생성 
		Item item = new Item();
		item.setName("전자시계");
		
		// item객체에 점을 찍어서 item.name과 같이 참조가 불가능한 상황 private 이라서 .. 
		
		// Item 객체에 저장된 상품의 이름을 불러와서(참조해서) 활용하려면?
		// 활용?
		// 1. 특정 변수에 담기 
		// 2. 어딘가에 전달하기 (다른 클래스의 생성자나, 다른 객체의 메소드에)
		// 3. 콘솔창에 출력하기  .. 등등 .. 
		
		// String a = item.name; 이거 대신에 
		String a = item.getName(); //이렇게 
		
		// System.out.println(item.name); // 이거 대신에 
		System.out.println(item.getName()); // 이렇게 사용한다. 
	}
}
