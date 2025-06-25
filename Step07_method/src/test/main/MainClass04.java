package test.main;

import test.mypac.Post;

public class MainClass04 {
	public static void main(String[] args) {
		// sendPost()메소드를 호출해보세요. 5가지 방법이 있다 
		sendPost(null); // 1번, 빈값을 전닳
		
		sendPost(new Post()); //2번, post 객체를 생성해서 전닳 
		
		sendPost(new Post(1, "제목", "김구라")); //3번, post 객체를 생성하면서 값을 전달
		
		Post p1 = new Post(2, "제목2", "원숭이"); //4번, 미리 생성 후 객체전달
		sendPost(p1);
		
		Post p2 = new Post(); //5번, setter 메서드로 글정보를 전달 
		p2.setId(3);
		p2.setTitle("제목3");
		p2.setAuthor("해골");
		sendPost(p2);
	}

	public static void sendPost(Post post) {
		System.out.println("글을 전송했습니다");
	}
}
