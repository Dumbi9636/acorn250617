package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

public class MainClass04 {
	public static void main(String[] args) {
				// SELECT 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
				Connection conn = null;
				
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					// 우리가 설계한 DBConnector 클래스를 이용해서 Connection 객체 얻어내기
					conn = new DBConnector().getConn();
					// 실행할 sql 문 미리 준비하기 (java10 부터 추가된 문법)
					String sql = """
							SELECT empno, ename, deptno, dname
							FROM emp
							INNER JOIN dept USING(deptno)
							ORDER BY empno ASC
							""";
					pstmt = conn.prepareCall(sql);
					rs = pstmt.executeQuery();
					while(rs.next()){
						int empno = rs.getInt("empno");
						String ename = rs.getString("ename");
						int deptno = rs.getInt("deptno");
						String dname = rs.getString("dname");
						//format 이용해보기
						String info = String.format("사원번호:%d 사원이름:%s 부서번호:%d 부서명:%s", empno, ename, deptno, dname);
						System.out.println(info);
						//System.out.println(empno+"  |  "+ename+"  |  "+deptno+"  |  "+dname);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
	}
}
