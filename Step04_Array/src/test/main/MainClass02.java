package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0으로 초기화된 방3개짜리 int[] 객체를 만들어서 참조값을 지역변수 nums에 담기
		int[] nums = {0, 0, 0};
		
		//0번방에 10, 1번방에 20, 2번방에 30을 저장하기
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// 0으로 초기화된 방 500개짜리 int[] 객체를 만들어서 참조값을 지역변수 nums2에 담기
		int[] nums2 = new int[500];
		
		// 배열의 첫번째와 마지막 요소가 0으로 잘 초기화 되었는지 확인 
		System.out.println(nums2[0]);   // 출력: 0
		System.out.println(nums2[499]); // 출력: 0
	}
	
}
