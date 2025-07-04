package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame{
	//필요한 필드 정의하기
	JTextField inputName, inputAddr;
	// 표 형식으로 정보를 출력할 UI
	JTable table;
	// JTable 에 출력할 data 를 공급해줄 모델 객체 
	DefaultTableModel model;
	
	// MemberDao 를 자주 사용할 예정이기 때문에 미리 필드에 참조값을 넣어두기 
	MemberDao dao = new MemberDao(); // var 은 지역변수에서만 가능, 필드에서는 데이터타입 명시해야함 
	
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
		JButton deleteBtn = new JButton("삭제");
		JButton updateBtn = new JButton("수정");
		
		// 버튼의 동작
		insertBtn.addActionListener((e)->{
			// 입력한 이름과 주소를 읽어와서
			var name = inputName.getText();
			var addr = inputAddr.getText();
			
			// MemberDto 객체에 이름과 주소를 담는다.
			var dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			
			// MemberDao 객체를 이용해서 DB에 저장하기 
			MemberDao dao = new MemberDao();
			var isSuccess = dao.insert(dto);
			if(isSuccess) {
				printMember();
				// this 는 나의 참조값 ( 나 => MemberFrame 객체 => Component type이기도 하다)
				JOptionPane.showMessageDialog(this, "추가했습니다");
			}else {
				JOptionPane.showMessageDialog(this, "추가 실패!");
			}
			
		});
		
		// 삭제 버튼 눌렀을때 실행할 함수 등록 
		deleteBtn.addActionListener((e)->{
			
			// 선택된 row 의 index 값을 읽어온다
			int selectedRow = table.getSelectedRow();
			// 만일 선택된 row 가 없다면
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택해 주세요!");
				return; // 메소드(함수)를 여기서 끝내기(리턴하기)
			}
			// 삭제할 회원의 Primary Key 값(번호)을 읽어와서 
			int num = (int)model.getValueAt(selectedRow, 0);
			// DB에서 삭제한다
			dao.deleteByNum(num);
			// DB 에서 회원정보를 다시 읽어와서 출력한다
			printMember();
		});
		
		// 수정 버튼을 눌렀을때 실행할 함수 등록
		updateBtn.addActionListener((e)->{
			// 선택된 row의 index 값을 읽어온다 
			int selectedRow = table.getSelectedRow();
			// 만일 선택된 row 가 없다면
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택해 주세요!");
				return; // 메소드(함수)를 여기서 끝내기(리턴하기)
			}
			// 수정할 회원의 Primary Key 값(번호)을 읽어와서 
			int num2 = (int)model.getValueAt(selectedRow, 0);
			String updatename = inputName.getText();
			String updateaddr = inputAddr.getText();
			
			
			// MemberDto 객체에 수정한 이름과 주소를 담는다
			MemberDto dto2 = new MemberDto();
			dto2.setNum(num2);
			dto2.setName(updatename);
			dto2.setAddr(updateaddr);
			
			boolean isSuccess = dao.update(dto2);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "수정했습니다!");
			}else {
				JOptionPane.showMessageDialog(this, "수정에 실패했습니다 row를 선택해주세요!");
			}
			printMember();
		});
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		panel.add(deleteBtn);
		panel.add(updateBtn);
		inputName.getText();
		inputAddr.getText();
		//페널의 배경색 설정 
		panel.setBackground(Color.orange);
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		// 회원목록을 출력할 테이블
		table = new JTable();
		// 테이블의 칼럼명을 배열로 미리 준비한다
		String[] colNames = {"번호","이름","주소"};
		// 테이블에 연결할 모델 객체
		model = new DefaultTableModel()	;
		// 모델에 칼럼명을 전달한다.
		model.setColumnIdentifiers(colNames);
		model.setRowCount(0); // 처음에는 row 가 없도록 
        // 모델을 테이블에 연결
		table.setModel(model);
		// 테이블의 글자 크기와 행의 높이 조절 
		table.getTableHeader().setFont(new Font("sans-serif", Font.BOLD, 18));
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); // 데이터 글자 크기 14
		table.setRowHeight(25); // 각 행의 높이를 조정
		// row 가 많은 경우 스크롤이 가능하도록 테이블에 scroll 기능을 부여한다.
		JScrollPane scroll = new JScrollPane(table);
		// 테이블을 품고 있는 JScrollPane 을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		
		// sample data 를 table 에 출력하기
		//Object[] row1 = {0, "sample name", "sample addr"};
		//model.addRow(row1);
		
		// MemberDao 객체를 이용해서 회원목록을 얻어온 다음 실제 회원 목록을 table 에 반복문 돌면서 출력해보세요
		printMember(); // 메소드로 만들어 놓음 
	}
		
					
		
	
	
	// 회원 목록을 출력하는 메소드 
	public void printMember() {
		model.setRowCount(0);
		List<MemberDto> list = dao.selectAll();
		for(MemberDto tmp :list) {
			// MemberDto 객체 하나당 하나의 Object[] 를 만들어서 
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			// 모델에 추가하기 
			model.addRow(row);
		}
	}
	
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
