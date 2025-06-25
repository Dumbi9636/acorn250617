package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// printSum() 메소드를 3번 호출해보세요.
		printSum(1, 2);
		printSum(10, 20);
		printSum(100, 200);
		
	}
	
	public static void printSum(int num1, int num2) {
		int result = num1+num2;
		System.out.println(num1+"과 "+num2+"의 합:"+result);
	}
}
