package test.main;
/*
 * 6. 3항 연산자
 * 
 *  조건 ? 값1(참일때의 값) : 값2(거짓일 때의 값)  
 * 
 */
public class MainClass10 {
	public static void main(String[]args) {
		boolean isWait = false;
		// isWait이 true면 "기다려요"가 대입되고 false면 "기다리지 않아요"가 대입된다.
		String result = isWait ? "기다려요":"기다리지 않아요";
		System.out.println(result);
		
		
		//위의 3항 연산자는 아래와 같이 if ~ else 문과 같은 로직이다.
		String result2 = null;
		if(isWait) {
			result2 = "기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
	}
}
