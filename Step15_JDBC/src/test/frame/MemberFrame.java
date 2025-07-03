package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberFrame extends JFrame{
	//필요한 필드 정의하기
	JTextField inputName, inputAddr;
	
	//생성자
	public MemberFrame() {
		
		//레이아웃 설정
		setLayout(new BorderLayout());
		
		//JLable 2개
		JLabel label1=new JLabel("이름");
		JLabel label2=new JLabel("주소");
		
		//JTextField 1개
		inputName =new JTextField(10);
		inputAddr =new JTextField(10);
		
		// JButton
		JButton insertBtn = new JButton("저장");
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		inputName.getText();
		inputAddr.getText();
		//페널의 배경색 설정 
		panel.setBackground(Color.orange);
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		
		// 버튼에 이벤트 리스너 추가
        insertBtn.addActionListener(e -> {
            System.out.println("저장을 눌렀네요");
        });
        
        
	}
	
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
