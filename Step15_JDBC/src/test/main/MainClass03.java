package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass03 {
	public static void main(String[] args) {
		Connection conn = null;
		// Connection 객체의 참조값을 알아내는 코드 
				try {
					//오라클 드라이버 로딩 ( ojdbc...jar 파일이 있어야 아래의 코드가 동작한다)
					Class.forName("oracle.jdbc.driver.OracleDriver");
					//접속할 DB 의 정보 @아이피주소:port번호:db이름
					String url="jdbc:oracle:thin:@localhost:1521:xe";
					//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
					conn=DriverManager.getConnection(url, "scott", "TIGER");
					//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
					System.out.println("Oracle DB 접속 성공");
				
				} catch (Exception e) {
					e.printStackTrace();
				}	
				
				
				// SELECT 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
					String sql = "SELECT deptno, dname, loc FROM dept ORDER BY deptno ASC";
					// sql 문을 전달하면서 prepared
					pstmt = conn.prepareCall(sql);
					rs = pstmt.executeQuery();
					while(rs.next()) {
						// 부서번호
						int deptno=rs.getInt("deptno");
						// 부서명
						String dname = rs.getString("dname");
						// 부서위치 
						String loc = rs.getString("loc");
						
						//현재 cursor가 위치한 곳의 데이터를 테스트로 출력해보기
						System.out.println(deptno+"  |  "+dname+"  |  "+loc);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
	}
}