package test.frame01;

import javax.swing.JFrame;
/*
 * Graphic User Interface 를 만들 수 있는 클래스 설계하기 
 * 
 *  1. JFrame 클래스를 상속 받는다. 
 *  2. 생성자에서 필요한 초기화 작업을 한다. 
 *  3. main() 메소드에서 이 클래스로 객체를 생성하면 프레임(window)가 만들어진다. 
 */
public class MyFrame extends JFrame {
	
	// 생성자
	public MyFrame() {
		// 프레임의 제목을 설정하는 메소드 
		this.setTitle("나의 프레임"); 
		// 프레임의 위치와 크기를 설정하는 메소드
		setBounds(100, 100, 500, 500);  
		// 종료(x) 버튼을 눌렀을떄 프로세스(app) 전체가 종료되도록 한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		// 화면상에 실제 보이도록 한다.
		setVisible(true);
		
	}
}
