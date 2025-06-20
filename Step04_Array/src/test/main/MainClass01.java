package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * in javascript 
		 * let nums=[10, 20, 30, 40, 50];
		 * nums[0]
		 * nums[1]
		 */
		
		/*
		 * in java
		 * 
		 * int [ ] nums ={10, 20, 30, 40, 50};
		 * nums[0]
		 * nums[2]
		 */
		
		// 배열도 참조 data type이다 
		int[] nums ={10, 20, 30, 40, 50};
		
		// nums 배열에 저장된 숫자를 반복문 돌면서 콘솔창에 하나씩 순서대로 출력하기 (for문)
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("--------------------------------------");
		
		/*
		 * "김구라" "해골" "원숭이" "주뎅이" "덩어리" 5개의 문자열이 저장된 배열을 만들고 
		 * 그 참조 값은 names라는 변수에 대입해보세요.
		 */
		String[] names = {"김구라", "해골", "원숭이", "주뎅이", "덩어리"}; // names의 datatype은 string Array인 것 
		
		// names 배열에 저장된 문자열을 반복문 돌면서 콘솔창에 하나씩 순서대로 출력하기 (for문)
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
