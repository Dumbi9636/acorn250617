package test.main;

import test.mypac.Person;
import test.mypac.Programmer;
import test.mypac.Singer;

public class MainClass08 {
	public static void main(String[] args) {
		
		// Person 객체를 생성해서 Person type으로 받으면 모든 메소드를 다 사용할 수 있다.
		Person p1 = new Person();
		p1.work();
		p1.sing();
		p1.develop();
		
		System.out.println("------------");
		
		// Person 객체를 생성해서 Singer type으로 받으면 sing() 메소드만 사용가능
		// casting 을 하면 다른 타입의 기능도 사용이 가능하다. 
		Singer p2 = new Person();
		p2.sing();
		
		System.out.println("------------");
		
		// Person 객체를 생성해서 Programmer type으로 받으면 devlop() 메소드만 사용가능
		Programmer p3 = new Person();
		p3.develop();
		
		
	}
}
