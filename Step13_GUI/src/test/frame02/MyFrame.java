package test.frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
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
		setDefaultCloseOperation(3);
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		// JButton 객체 생성
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");

        // 버튼에 이벤트 리스너 추가
        btn1.addActionListener(e -> {
            System.out.println("버튼1을 눌렀네요");
        });

        btn2.addActionListener(e -> {
            System.out.println("버튼2를 눌렀네요");
        });

        btn3.addActionListener(e -> {
            System.out.println("버튼3을 눌렀네요");
        });
		
		// 프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		add(btn1);
		add(btn2);
		add(btn3);

		// 화면상에 실제 보이도록 한다.
		setVisible(true);
	
	}
	// main 메소드 만들기
	public static void main(String[] args) {
		new MyFrame();
	}
}
