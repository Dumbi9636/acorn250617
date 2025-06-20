package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		
		// String type이 저장되어 있는 배열
		String[] data = {"🍒", "🍎", "🍌", "🍈", "7"};
		
		// 위에 배열에 저장된 5개의 문자열중에서 랜덤하게 1개만 콘솔창에 출력되도록 해보세요. 
		Random ran = new Random();
		int ranNum = ran.nextInt(5);
		
		System.out.println(data[ranNum]);
		
		
		
	}
}
