package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 여기는 팀원이 코딩한다고 가정
		 * 팀원이 직접 Drill type 객체를 생성해서
		 * 어디에 구멍을 뚫을지 결정할 수 있다.  
		 */
		
		Drill d1 = new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요!");	
			}
		};
		useDrill(d1);
		
		// () -> { } 는 @Override된 메소드이다.어차피 메소드 는 1개니까, 메소드를 호출하면서 메소드를 전달한 느낌  
		Drill d2 = ()->{
			System.out.println("줄인표현으로 구멍 뚫기");
		};
		useDrill(d2);
		
		useDrill(()->{
			System.out.println("너무 어렵다");
		});
	}
	/*
	 * useDrill()기능을 만드는 프로그래머(팀장, 라이브러리나 프레임워크 개발자) 입장에서 생각해보자
	 * Drill 인터페이스는 본인이 미리 만들어 놓은 상태
	 * 메소드 안에서 Drill 객체를 이용해서 어떤 복잡한 동작을 미리 만들어 놓을 수 있다.   
	 */
	public static void useDrill(Drill d) {
		d.hole();
	}
}
