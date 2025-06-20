package text.main;

import java.io.PrintStream;

import test.auto.Car;
import test.util.MyUtil;

public class MainClass06 {
	public static void main(String[]args) {
		
		// c1은 null이다 "객체를 저장할 수 있는 공간만 만들어둔 것"
		Car c1 = MyUtil.car;
		
		// Car 객체를 생성해서 MyUtil 클래스의 car라는 필드에 담기
		// car라는 필드는 클래스에 점을 찍은 것이고, 오른쪽 new는 객체를 생성한 것 
		MyUtil.car = new Car(); 
		
		// c1은 위에서 생성한 Car 객체의 참조값이 들어있다.
		// 대입연산자를 이용해서 넣을 수도 있다. 
		Car c2 = MyUtil.car;
		c2.drive();
		// MyUtil클래스의 car라는 필드를 직접 참조해서 drive()메소드를 호출할수도 있다. 
		MyUtil.car.drive();
		
		PrintStream p =System.out;
		p.println("xxx");
		
	}
}