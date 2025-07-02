package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame  extends JFrame implements ActionListener {
	
	// 버튼의 참조값을 담을 필드 
	JButton countBtn;
	
	// 버튼을 누른 횟수를 저장할 필드
	int count = 0;
	
	// 생성자
	public MyFrame() {
		setTitle("나의 프레임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 매니저객체 생성 
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		
		// JButton 만들기 , 생성한 버튼의 참조값을 필드에 저장하면 객체안에서 어디서든지 활용가능 
		this.countBtn = new JButton("0");
		
		// 버튼 컴포넌트를 프레임에 붙이기
		add(countBtn);
		
		countBtn.addActionListener(this);
		
        setVisible(true);
        
		// 버튼의 setText() 메소드를 이용하면 버튼에 출력된 문자열을 변경할 수 있다. 
		// countBtn.setText("1");
	}
	// main 메소드 
	public static void main(String[] args) {
		new MyFrame();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// count 값을 1 증가시킨다
		count++;
		// 버튼의 text를 변경하려면 생성자에서 new JButton ()했던 참조값을 여기서 사용할 수 있어야한다. 
		countBtn.setText(Integer.toString(count));
	
	}
}
