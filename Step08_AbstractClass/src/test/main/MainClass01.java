package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		
		// 추상 클래스도 data type의 역할을 할 수가 있다. 
		Weapon w1 = null;
		
		// 그렇다면 Wapon type의 참조값은 어떻게 얻어낼까?
		// Weapon w2 = new Weapon();
		// 추상클래스는 data type의 역할은 할 수 있지만, 단독으로 객체 생성은 불가하다. 
		
		// Weapon 추상클래스를 상속받은 MyWeapon 클래스로 객체를 생성해서 Weapon type의 참조값 얻어내기
		Weapon w2 = new MyWeapon(); // 다형성에 의해 Weapon type이기도 하다 
		w2.prepare();
		w2.attack();
	}
}
