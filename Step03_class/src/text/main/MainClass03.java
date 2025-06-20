package text.main;

import test.auto.Car;

public class MainClass03 {
	public static void main(String[]args) {
		//test.auto라는 패키지에있는 Car 클래스를 이용해 객체를 만들고, 
		//그걸 c1이라는 이름으로 저장해둔다
		Car c1 = new Car();
		
		// 필드에 참조되는 값을 지역변수에 담아보기
		String name = c1.name; //null
		//c1.name: c1이라는 객체가 가지고 있는 name이라는 필드"에 접근
		//c1.price: c1이라는 객체가 가지고 있는 price이라는 필드"에 접근
		int price = c1.price; // 0
		
		//"나는 name이랑 price를 main에서 그냥 쓴 건데,그걸 필드로 만든 적은 없어.
		// 그럼 저 name, price는 어디서 온 거야? 진짜 필드야?"
		// 맞다. name과 price는 Car 클래스 안에서 이미 필드로 선언되어 있기 때문에
		// c1.name, c1.price처럼 객체를 통해 접근할 수 있다.
		
		// Car 객체의 필드에 값을 대입해보기
		c1.name = "소나타";
		c1.price = 3000;
		
		// 담은 후에 참조되는 값을 지역변수에 담아보기
		String name2 = c1.name; // "소나타"
		int price2=c1.price; // 3000 
	}
}
