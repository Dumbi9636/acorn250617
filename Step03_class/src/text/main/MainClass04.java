package text.main;

import test.auto.Car;

public class MainClass04 {
	public static void main(String[]args) {
		Car c1 = new Car();
		c1.name="소나타";
		
		Car c2 =new Car();
		c2.name = "그렌저";
		
		//c1.drive();
		c2.drive();
		
	}
}		// 필드에 오는 값에 따라 결과가 달라진다. (소나타, 그렌저)
		// 필드는 메서드가 동작하는데에 중요한 부품을 담고 있다. 
