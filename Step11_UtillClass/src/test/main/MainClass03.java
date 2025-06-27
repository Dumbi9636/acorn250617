package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in)
		// 위에서 생성한 Scanner 객체로 반복문 돌면서 문자열을 5번 입력받아서
		// 입력 받을 때마다 ArrayList<String> 객체에 add() 하고 
		// 다 입력 받으면 다시 한 번 반복문 돌면서 ArrayList<String> 객체에 저장된 문자열 5개를 
		// 순서대로 콘솔창에 출력하는 프로그래밍을 해보세요. 
		
		// 콘솔창으로 부터 입력 받을 수 있는 Scanner 객체 생성 
		Scanner scan = new Scanner(System.in);
		
		// 문자열을 순서대로 저장할 수 있는 ArrayList 객체 생성 
		ArrayList<String> list = new ArrayList<>();
		System.out.println("문자열을 입력하세요");
		
		
		for (int i = 0; i < 5; i++) {
			// Scanner 객체를 이용해서 여기서 문자열 입력 받기 
			String input = scan.nextLine();
			 list.add(input);
		}
		// 다시 한 번 반복문 돌면서 문자열 5개 출력하기 // 확장 for문 이용
		for(String input : list);{
			System.out.println("입력된 문자: " + list);
		}
	}
}