package test.main;

import test.box.AppleBox;
import test.box.BananaBox;
import test.fruit.Apple;
import test.fruit.Banana;

public class MainClass01 {
	public static void main(String[] args) {
		// Apple 객체를 생성해서 AppleBox 객체에 담아 보세요 
		
		Apple a1 = new Apple();
		
		AppleBox b1 = new AppleBox();
		b1.pack(a1);
		b1.unPack();
		
		// Banana 객체를 생성해서 BananaBox 객체에 담아 보세요 
		Banana c1 = new Banana();
		BananaBox d1 = new BananaBox();
		d1.pack(c1);
		d1.unPack();
		}

}
	