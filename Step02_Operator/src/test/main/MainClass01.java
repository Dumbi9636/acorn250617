package test.main;
/*
 * 1. 산술연산자 테스트
 * 
 *  +, -, *, /, %
 */
public class MainClass01 {
	public static void main(String[]args) {
		int num1=5;
		int num2=2;
		
		// + 연산 하기
		int sum = 10+1;
		int sum2 = num1+num2;
		int sum3 = 10 + num2;
		
		// 정수끼리 연산하면 결과는 정수만 나온다.
		int result1 = 5 / 3;
		int result2 = num1 / num2;
		
		// 연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야한다. 
		//double result3 = 5 / 3.0; 
		double result3= 5/(double)3; //위와 같은 개념 
		// 10을 3으로 나눈 나머지 값을 변수에 담기 
		int result4 = 10%3;
		

		byte a = 10;
		// a는 byte type인데 a에 저장된 값을 int type b에 대입하는건 문제가 없을까? 
		int b = a;
		// byte -> short -> int -> long 
		// byte를 int에 넣는것은 문제가 없다. int가 훨씬 넓기 때문 
		
		// b는 int type인데 b에 저장된 값을 byte type c에 대입하는건 문제가 없을까?  
		//byte c = b;
		// b는 int, c는 byte이기에 문제가 발생할 수 있다.
		// 하지만 항상 문제가 있는 것은 아니다. byte허용범위 내의 int값을 가지면 딱 맞게 들어갈 수도 있다. 
		
		/*
		 * b 자체는 int type 이지만 (byte) 연산자로 casting하면 
		 * 대입연산자의 우측에는 byte type이 있다고 간주되어서 문법이 성립한다.
		 * 대신 b안에 들어 있는 값이 byte 범위안에 들어 있다는 것이 확실할때만 
		 * casting해야지 오류가 없다. 
		 */
		byte c= (byte)b;
		int d = 1000;
		// 잘못된 값이 들어간다. byte 의 범위는 -128 ~ 127 129는 실제로 -127처럼 순환된다.
		byte e = (byte)d;
		// 이처럼 순환되다보면 1000은 -27이 됨. 
	 
	}
}
