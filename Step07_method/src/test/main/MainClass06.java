package test.main;

import test.mypac.ZzangGu;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * ZzangGu 객체를 3개 생성해서 배열에 담고,
		 * 반복문 돌면서 배열에 담긴 ZzangGu 객체의 dance() 메소드를 모두 호출해보세요. 
		 */
		ZzangGu z1 = new ZzangGu();
		ZzangGu z2 = new ZzangGu();
		ZzangGu z3 = new ZzangGu();

		// 배열에 담기
		ZzangGu[] zs = new ZzangGu[3];
		zs[0] = z1;
		zs[1] = z2;
		zs[2] = z3;

		// 반복문으로 dance 호출
		for (int i = 0; i < 3; i++) {
			// i 번째 ZzangGu 객체 
			ZzangGu tmp = zs[i];
			tmp.dance();
		}
		System.out.println("----확장 for 문----");
		for(ZzangGu tmp : zs) {
			tmp.dance();
		}
	}
}