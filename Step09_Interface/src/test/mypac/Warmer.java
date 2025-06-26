package test.mypac;

//함수 형태로 쓰기 위한 어노테이션(메소드 1개가 강제된다)
@FunctionalInterface
public interface Warmer {
	public void warm(String target);
	// 메소드가 1개 일때는 람다식 표현이 가능하다. 
	
}
