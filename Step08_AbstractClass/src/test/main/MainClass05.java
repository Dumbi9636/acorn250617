package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * - 우주를 공격하고 싶다
		 * - Weapon 추상 클래스를 상속 받은 클래스를 파일로 만들어야 하는 졸라 귀찮음 OTL
		 * - Local Inner Class로 만들면 좀 편하겠다~~  
		 */
		class SpaceWeapon extends Weapon{

			@Override
			public void attack() {
				prepare();
				System.out.println("우주를 공격해요");
			}
		}
		// 위에서 생성한 클래스로 객체를 생성 
		Weapon w1 = new SpaceWeapon();
		
		// 메소드 호출
		w1.attack();
		
		// Weapon type의 변수를 만들기도 졸라 귀찮아
		new SpaceWeapon().attack(); // 객체 생성해서 1회용으로 사용하는 것도 가능하다 
		
	}
}
