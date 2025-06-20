package text.main;

import test.mypac.MemberInfo;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 1. 한명의 회원정보를 MemberInfo 객체에 담아보세요
		 * (번호, 이름, 주소 는 본인 마음대로 설정해서)
		 */
			MemberInfo mem1 = new MemberInfo();
			mem1.num = 1;
			mem1.name = "박준일";
			mem1.addr = "강남";
		 
			//2. 위에서 생성한 객체(MemberInfo)의 printData()메소드를 호출해보세요 
			mem1.printData();
			// class 생성 시 메소드를 생성해 놓으면 mem1에 .점을 찍으면
			// 객체가 가진 메소드안으로 흐름이 넘어가고, 호출이 가능하다
	}
}