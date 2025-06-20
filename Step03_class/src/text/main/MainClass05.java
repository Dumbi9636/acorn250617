package text.main;

import test.util.MyUtil;

public class MainClass05 {
	public static void main(String[]args) {
		
		//static 필드 참조
		String a = MyUtil.version;
		// version은 MyUtil 클래스의 static 필드라서 객체를 만들지않고 .점을
		// 찍어서 클래스 이름으로 바로 접근 가능 이것을 지역변수 a에  넣은 것 
		// version이 MyUtil class 에서 String type이기에 변수 a도 String 타입이된다. 
		
		// static 메서드 호출
		MyUtil.send(); // -> 클래스 전체가 static일 필요는 없다
		// 클래스 안에 있는 “메서드(또는 필드)”에 static이 붙었는지가 중요
		// MyUtil 클래스 자체는 일반 클래스인데 send앞에 static 키워드가 붙어있음. 
		// 그래서 객체 생성 없이 MyUtil.send();로 바로 호출이 가능한 것 
		
		MyUtil u1 = new MyUtil();
		u1.owner="김구라";
		// 위와 다르게 owner는 static이 아닌 non-static 필드 
		// 그래서 new로 반드시 객체를 만들어야 접근이 가능
		// u1(객체를 참조하는 변수)이 가리키는 객체(heap에 생성되는)의 owner 필드에 "김구라"라는 값을 저장.
		
		
		MyUtil u2 = new MyUtil();
		u2.owner = "해골";
	}
}
