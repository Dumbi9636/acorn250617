package test.util;

import test.auto.Car;
public class MyUtil {
	
	// non static 필드추가 
	public String owner; //static이 없음 !! 
	
	// Car type을 담을 수 있는 static 필드 
	public static Car car;

	//data type 앞에 static 예약어를 붙여서 static 필드를 만들 수 있다.
	// static 필드 선언시에 초기값을 넣어줄수도 있다
	public static String version ="1.0";
	
	// 객체를 활용한 인스턴스 메서드를 사용하여 기능을 호출할 수 있다.  
	public static void send() {
		System.out.println("전송합니다.");
	}
}

