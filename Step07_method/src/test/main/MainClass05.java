package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger type 객체의 sendPost() 메소드를 호출해보세요 
		// 실행했을때 Exception이 발생하지 않아야 합니다. 
		
		// Messenger type 객체의 sendPost() 메소드를 호출하기 위해서는
		// Meseenger 객체를 생성해야한다. 
		Messenger m1 = new Messenger();
		
		//sendPost는 Post type의 객체를 매개변수로 요구하기에 Post 객체를 만들어줘야 한다. 
		Post p1 = new Post(2, "제목2", "원숭이"); 
		
		// post 객체 넘겨줌
		m1.sendPost(p1);  
	
	}
}
