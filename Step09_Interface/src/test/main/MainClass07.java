package test.main;

import test.mypac.Operator;

public class MainClass07 {
	public static void main(String[] args) {
		
		// Operator 객체를 만드는 것은 자유 단, 타입이 맞아야함 
		// 더하기 연산을 해서 결과값을 리턴해주는 Operator type 객체 
		Operator plus = (double num1, double num2)->{
			return num1+num2;
		};
		
		// 빼기 연산을 해서 결과값을 리턴해주는 Operator type 객체
		// 매개변수의 type 생략 가능(double) 
		Operator minus = ( num1, num2)->{
			return num1-num2;
		};
		
		// 메소드의 { } 생략하고 return 예약어 없이 리턴할 값만 -> 우측에 작성해도 된다. 
		Operator multiple = (a, b)-> a*b;
		
		double result1 = plus.execute(10, 10); // 20 
		double result2 = minus.execute(10, 10); // 0
		double result3 = multiple.execute(10, 10); // 100
		
	}
}
