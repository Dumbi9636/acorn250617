package test.mypac;

public class PostDto {
	// 필드 정의하기
	// private으로 동일 객체 내부에서 접근하도록 만들기 
	
	// 글 번호를 저장할 필드
	private int id;
	
	// 글 내용을 저장할 필드
	private String content;
	
	// 글 작성자를 저장할 필드
	private String author;
	
	
	// PostDto 생성자 만들기 
	public PostDto() {
		System.out.println("PostDto 클래스의 생성자가 호출됨!");
	}
	
	//오버로딩으로 생성자 만들기 => 한번에 값을 넣기 위함 
	public PostDto(int id, String content, String author) {
		this.id = id;
		this.content = content;
		this.author = author;
	}
		
	// setter 메서드 글 번호를 저장 
	public void setId(int id) {
		this.id = id;
	}
	// getter 메서드 글 번호를 리턴 
	public void getId(int id) {
		this.id = id;
	}
	
	// setter 메서드 글 내용을 저장 
	public void setContent(String content) {
		this.content = content;
	}
	// setter 메서드 글 내용을 리턴 
	public void getContent(String content) {
		this.content = content;
	}
	
	// setter 메서드 글 작가를 저장 
	public void setAuthor(String author) {
		this.author = author;
	}
	// setter 메서드 글 작가를 리턴 
	public void getAuthor(String author) {
		this.author = author;
	}
}
