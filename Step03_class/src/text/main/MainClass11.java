package text.main;

import test.mypac.Post;

public class MainClass11 {
	public static void main(String[] args) {
		
		Post p1 = null;
		Post p2 = new Post();
		Post p3 = p2;
		
		// 위의 3줄을 실행하면 Post  객체는 총 몇개 생성될까? 
		// post객체는 new 할때만 생성되기에 1개 
		// 변수는 p1. p2. p3 3개 생성 
		// p2에 점을 찍어도 id =34, p3에 점을 찍어도 id=34 같은 사물함을 같이 쓰는 것이지
		// 객체가 2개 생성된 것은 아니다.
		
		p2.id =1;
		p2.content="hello";
		p2.author="kim";
		
		System.out.println(p3.content);
		// 동일한 객체의 content를 보고있기 때문에(같은 사물함) p3.content도 hello가 출력이 된다. 
		
		// p1에는 null이 들어 있기 때문에(비어 있어서) NullPointerException이 발생한다. 
		//System.out.println(p1.content);
	}
}
