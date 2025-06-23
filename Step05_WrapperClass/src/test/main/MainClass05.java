package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 1. 콘솔창으로 부터 입력 받을 수 있는 Scannner 객체를 생성해서 그 참조값을 scan이라는 지역변수에 담아보세요.
		 * 2. scan 에 담겨 있는 Scanner 객체를 2번 사용해서 콘솔창으로부터 숫자를 2개 입력 받으세요 
		 * 3. 입력받은 숫자(문자열)를 실제 숫자로 변경하세요. .parseInt or .parseDouble 사용 (정수/소수)
		 * 4. 두 수의 합을 구해서 콘솔창에 이쁘게 출력해보세요. 
		 * ---------
		 * 출력 예시
		 * 
		 * 첫번째 숫자입력:
		 * 10
		 * 
		 * 두번째 숫자입력:
		 * 20
		 * 
		 * 10+10 = 30 
		 */
		
		// 1. 콘솔창으로 부터 입력 받을 수 있는 Scannner 객체를 생성해서 그 참조값을 scan이라는 지역변수에 담아보세요.
		Scanner scan = new Scanner(System.in);
		
		
		//2. scan 에 담겨 있는 Scanner 객체를 2번 사용해서 콘솔창으로부터 숫자를 2개 입력 받으세요 (1번 사용)
		System.out.println("첫번째 숫자입력: ");
		String str = scan.nextLine();
		//3. 입력받은 숫자(문자열)를 실제 숫자로 변경하세요
		double result = Double.parseDouble(str);
		
		
		//2. scan 에 담겨 있는 Scanner 객체를 2번 사용해서 콘솔창으로부터 숫자를 2개 입력 받으세요 (2번 사용)
		System.out.println("두번째 숫자입력: ");
		String str2 = scan.nextLine();
		//3. 입력받은 숫자(문자열)를 실제 숫자로 변경하세요
		double result2 = Double.parseDouble(str2);
		
		//4. 두 수의 합을 구해서 콘솔창에 이쁘게 출력해보세요. 
		double sum = result + result2;
		System.out.println(result+"과 "+result2+"의 합은 :"+sum);
		/*  format 이용해보기 
		 *                                (실수는 %f로 치환한다, 정수는 %d, 문자열은 %s)
		 *  String info = String.format("%d 과 %d 의 합은 %f ", result, result2, sum);  
		 *  System.out.printIn(info);
		 */ 
		
	
	}
}
