package test.main;

import test.mypac.MemberInfo;

public class MainClass04 {
	public static void main(String[] args) {
		MemberInfo m1 = new MemberInfo();
		m1.num = 1; // 접근 메서드가 없으니 필드를 직접 참조
		m1.name = "김구라";
		m1.addr = "노량진";
		
		MemberInfo m2 = new MemberInfo();
		m2.num = 2; // 접근 메서드가 없으니 필드를 직접 참조
		m2.name = "해골";
		m2.addr = "행신동";
		
		MemberInfo m3 = new MemberInfo();
		m3.num = 3;
		m3.name = "원숭이";
		m3.addr = "동물원";
		
		// 위에서 생성한 MemberInfo 객체의 참조값 3개를 배열에 순서대로 담아보세요
		// 1줄 짜리
		MemberInfo[] info = new MemberInfo[3];
		// 또는 
		MemberInfo[] info3 = {m1, m2, m3};
		
		
		// 3줄 짜리 
		MemberInfo[] info2 = {null, null, null}; // 빈 방 3개
		info2[0] = m1; //0번방에 m1 담고
		info2[1] = m2; //1번방에 m2 담고
		info2[2] = m3; //2번방에 m3 담기 
		
	}
}
