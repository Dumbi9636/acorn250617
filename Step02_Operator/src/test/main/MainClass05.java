package test.main;
/*
 * 4. 논리 연산자 테스트
 * &&,  ||,  !
 * 
 * and, or, not 
 * 
 * 그리고, 또는, ~가 아니면 으로 읽으면 된다.
 */
public class MainClass05 {
	public static void main(String[]args) {
	/* or 연산
	 * 또는 이라고 읽으면 된다.
	 * 
	 * 어느 하나만 true면 결과는 true
	 * 모두다 false 일때만 결과가 false 
	 */
	boolean result1 = false || false; //false
	boolean result2 = false || true;  //true
	boolean result3 = true || false;  //true
	boolean result4 = true || true;  //true
	/* and 연산
	 * 그리고 라고 읽으면 된다.
	 * 
	 * 모두다 true일때만 결과가 true
	 * 어느 하나라도 false 이라면 결과가 false 
	 */
	boolean result5 = false && false; //false
	boolean result6 = false && true;  //false
	boolean result7 = true && false;  //false
	boolean result8 = true && true;  //true
	}
}
