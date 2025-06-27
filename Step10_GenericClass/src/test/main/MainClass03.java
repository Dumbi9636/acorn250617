package test.main;

import test.fruit.Apple;
import test.mypac.pair;

public class MainClass03 {
	public static void main(String[] args) {
		pair<String, Object> p1 = null;
		pair<Integer, String> p2 = null;
		
		// 기본 data type은 Generic 클래스로 사용할 수 없다. 
		// pair<int, String> p3 = null; 
		
		// 객체 생성 시 Generic 클래스는 생략 가능 <>만 입력해도 됨 
		// 객체 생성 시 받을 타입만 잘 작성해주면 된다 ("my", new Apple()) => (String, Apple객체타입)
		pair<String, Apple> p3 = new pair<>("my", new Apple());
		
		//테스트로 메소드 사용해보기 (호출해보기)
		String a = p3.getKey();
		Apple b = p3.getValue();
	}
}
