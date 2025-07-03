package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {
	
	// member 테이블에 회원 한명의 정보를 추가하는 메소드를 만든다고 생각해보자 
	public static boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		// 변화된 row 의 갯수를 담을 변수 선언하고 0으로 초기화
		int rowCount = 0; 
	
		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO member
					(num, name, addr)
					VALUES (member_sequence.NEXTVAL, ?, ?) 
					""";
			pstmt = conn.prepareStatement(sql);
			// ? 에 순서대로 필요한 값 바인딩 
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// pstmt.setInt(1, dto.getNum()); UPDATE할 때 사용할 참조값 
			// sql 문 실행하고 변화된(추가된, 수정된, 삭제된) row 의 갯수 리턴받기
			rowCount = pstmt.executeUpdate();
			
		}catch(Exception e) { // 예외가 발생시 표시한다 
			e.printStackTrace();
		}finally {
			try {
				// 메소드 호출하기 전에 null 인지 아닌지 체크, 아닌경우에만 호출하도록 
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
			
		}
		// 변화된 rowCount 값을 조사해서 작업의 성공 여부를 알아 낼수 있다.
		if(rowCount>0) {
			return true; // 작업 성공이라는 의미에서 true 리턴하기
		}else {
			return false; // 작업 실패라는 의미에서 false 리턴하기 
		}
	}
	
	public static void main(String[] args) {
		
				// DB 에 추가, 수정, 삭제할 회원의 정보라고 가정하자 (member table)
				// 삭제 경우를 위해 주석 처리, 삭제할 행(row)값인 num은 필요하다
				// int num = 1; UPDATE, DELETE 할 때 사용할 row 참조값 
				String name = "Kang";
				String addr = "Sanbon";
				// 회원의 이름과 주소를 MemberDto 객체에 담는다 
				MemberDto dto = new MemberDto();
				// dto.setNum(num); UPDATE, DELETE 할 때 사용할 setter메서드 참조값
				dto.setName(name);
				dto.setAddr(addr);
				// 메소드 호출하면서 전달하고 작업의 성공여부를 리턴 받는다. 
				boolean isSucces = insert(dto);
				if(isSucces) {
					System.out.println("성공이네.. 성공이니까 일해라..");
				}else{
					System.out.println("실패니까 절해라...");
				}	
		}
}