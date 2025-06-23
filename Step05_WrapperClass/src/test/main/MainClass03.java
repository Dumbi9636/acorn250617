package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		Integer i = 10; //Integer 도 class 임
		
		int result = Integer.parseInt("10");
		
		// NumberFormatException 발생 
		//int result2 = Integer.parseInt("십");
		
		double result3 = Double.parseDouble("10.1");
		
	}
}
