package test.mypac;

public class Post {
	//글번호를 저장할 필드 
	public int id;
	
	// 글내용을 저장할 필드
	public String content;
	
	// 글 작성자를 저장할 필드
	public String author;
	
	// 객체의 필드에 있는 정보를 이쁘게 출력해주는 메소드 
	public void printData() {
		/*
		 * format이라는 static 메서드 
		 * 클래스이름 뒤에 점을 찍어서 format 메서드를 호출 
		 * format 메소드는 그냥 + 연산으로 이어붙이는 것보다 훨씬 가독성이 좋다
		 * 숫자·문자·소수점까지 원하는 모양으로 표현 
		 * 숫자(정수)는 %d
		 * 문자는 %s
		 * % -> % -> %의 순서대로 들어간다 
		 */
		String data = String.format("번호:%d 내용:%s 작성자:%s ", this.id, this.content, this.author);
		System.out.println(data);
	}
	
}
