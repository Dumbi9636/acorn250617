package test.main;

import test.mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 여기서 아래에 정의된 useWeapon()메소드를 호출하려면?  
		 */
		// 둘다 static 메서드니까 호출이 가능 
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("아무데나 공격!");
			}
		});
	}	
	
	public static void useWeapon(Weapon w) {
		w.attack();
	}
}
