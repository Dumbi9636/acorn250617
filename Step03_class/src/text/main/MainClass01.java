package text.main;

import java.io.File;
import java.io.IOException;
// java.util 패키지에 있는 Random 클래스를 import
import java.util.Random;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[]args) throws IOException {
		System.out.println("메인 메소드가 시작 되었습니다.");
		// 기본 데이터 type의 값이 담길 수 있는 빈공간은 만들 수 없다.
		//int num = null;
		int num; // 선언만하면 변수가 만들어지지 않는다. -> 준비단계 
		num = 10; //값을 넣는 시점에 변수가 만들어진다. 
		
		// 문자열을 다룰때는 String type 을 사용하면 된다. 
		String name = "kim";
		
		// 랜덤한 숫자를 얻어내고 싶다면 ? 
		// 랜덤한 숫자를 알아서 생성해주는 기능을 가진 객체가 필요한 것 
		Random ran = null;
		
		ran = new Random(); 
		boolean result1=ran.nextBoolean();
		System.out.println(result1);
		
		int result2=ran.nextInt();
		System.out.println(result2);
		// 콘솔창에 문자열을 출력하고 싶다면? 
		// 콘솔창에 문자열을 출력해주는 기능을 가진 객체가 필요한 것 
		
		// 파일 시스템에 memo.txt 파일을 만들고 싶다면?
		// 파일을 만들 수 있는 기능을 가진 객체가 필요한 것 
		File f = new File("c:/playground/memo.txt");
		f.createNewFile();
		
		// 콘솔창에 입력한 숫자나 문자열을 읽어들이고 싶다면?
		// 콘솔창에 입력한 내용을 이용해서 int나 string을 만들어내는 기능을 가진 객체가 필요한 것 
		Scanner scan = new Scanner(System.in);
		String line=scan.nextLine();
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
