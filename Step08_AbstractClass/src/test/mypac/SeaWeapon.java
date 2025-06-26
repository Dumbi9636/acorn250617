package test.mypac;

public class SeaWeapon extends Weapon {

	@Override
	public void attack() {
		prepare(); //Weapon, 부모를 상속받았고 그 객체에 prepare되어 있기에 가능 
		System.out.println("해상 공격을 해요!");
		
	}
}
