package test.main;

public class MainClass09 {
	public static void main(String[]args) {
		/*
		 * 1~100 사이의 숫자 중에서 짝수의 총합을 구해서 출력하는 프로그래밍을 해보세요 
		 */
		
		// 반복문 안에 조건문(if문) 넣어서 조건에 해당하는 경우에만 더하도록 만들기 
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {  // i를 2로 나눈 나머지가 0과 같으면 => 짝수이면 
			sum += i; // 짝수의 합을 더해서 대입
			}
		}
		System.out.println("1~100 사이의 숫자 중에서 짝수의 총합: "+sum);
		
		// sum 초기화 
		sum = 0;
		
		// 2부터 시작하여 100까지 2씩 더하기  
		for(int i=2; i<=100; i+=2) {
			sum += i; // 짝수의 합을 더해서 대입
		}
		System.out.println("1~100 사이의 숫자 중에서 짝수의 총합: "+sum);
	}
}
