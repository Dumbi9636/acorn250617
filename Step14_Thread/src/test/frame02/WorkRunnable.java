package test.frame02;
/*
 * 새로운 스레드 만드는 방법2 
 * 
 * 1. Runnable 인터페이스를 구현한 클래스를 정의한다
 * 2. run() 메소드를 강제 오버라이드한다
 * 3. Thread 클래스로 객체를 생성하면서 해당클래스로 만든 객체를 생성자의 인자로 전달한다.
 * 4. Thread 클래스로 만든 객체의 start() 메소드를 호출해서 스레드를 시작시킨다.
 */
public class WorkRunnable implements Runnable { // 인터페이스는 추상메서드를 오버라이드하는게 강제된다. Runnable은 메소드 1개 짜리 인터페이스  

	@Override
	public void run() {
		// 여기는 메인스레드가 실행해준다( 버튼을 누르면)
		System.out.println("10 초 걸리는 작업을 시작합니다");
		try {
			// 결과적으로 메인스레드는 10초간 sleep 상태로 된다. 
			Thread.sleep(1000*10);
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("작업이 종료 되었습니다");
	}
	
}
