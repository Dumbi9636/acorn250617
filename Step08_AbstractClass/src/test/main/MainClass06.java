package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * - Cyber 공간을 공격하고 싶다 
		 * - 클래스 파일을 따로 만들기 싫다.  => Local Inner Class 로 만들면된다. 
		 * - 근데 생각해보면 MyWeapon, SkyWeapon, SeaWeapon, SpaceWeapon 등의 
		 * 	 type은 필요없다. 따라서 클래스의 이름일 짓기도 졸라 구찮음,. => 익명의 Local Inner Class를 활용 ! 
		 */
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				prepare();
				System.out.println("cyber 공격을 해요!");
				
			}
		};
		w1.attack(); // Cyber 공격이 되면 된다. 
		
		/*
		 * 가상(virtual)공간을 공격해야 한다.
		 * 익명의 Local Inner Class 를 이용해서 Weapon type 객체를 생성해서 공격할 예정인데 
		 * 1번만 공격할꺼야. => 위에처럼 w1이라는 변수를 만들지 않고 1회용으로 객체를 만들어서 사용할 예정 
		 */ 
		new Weapon() {
			
			@Override
			public void attack() {
				prepare();
				System.out.println("Virtual 공간을 공격해요!");
			}
		}.attack();
		
		
		
		
		
	}
}
