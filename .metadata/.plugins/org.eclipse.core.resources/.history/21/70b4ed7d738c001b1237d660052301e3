import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import JavaProject;

public class ManagerAccounting {

// 갱신
	public void updateAccountingtable() {

		Scanner scan = new Scanner(System.in);

		int 코드 = null;
		String 메뉴 = null;
		int 판매가격 = null;
		int 원가 = null;

		JavaProject.scan.next();
		System.out.println("코드 입력 ");
		코드 = JavaProject.scan.nextInt();
		System.out.println("메뉴 입력");
		메뉴 = JavaProject.scan.next();
		System.out.println("판매가격 입력");
		판매가격 = JavaProject.scan.nextInt();
		System.out.println("원가 입력");
		원가 = JavaProject.scan.nextInt();

		// try 구문 안에 있는 내용을 실행하다가 에러가 발생하면 catch로 빠진다.
		/*
		 * 1. jar 파일 추가 확인 2. DB 연결 3. SQL 구문 작성
		 */

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AI","1234");

			System.out.println("DB 연결 성공");

			pstmt = conn.prepareStatement("UPDATE ACCOUNTING " + "SET 코드 = ?, 메뉴 = ?, 판매가격 = ?, 원가 = ? " + "WHERE IDX = ? ");
			pstmt.setInt(1, 코드);
			pstmt.setString(2, 메뉴);
			pstmt.setInt(3, 판매가격);
			pstmt.setInt(4, 원가);

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("에러 그 클래스 파일 없음");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//------------------------------------------------------------------------------------------------------------------------------신메뉴 출시하면 메뉴 추가?
/*
	public void insertAccountingtable() {

		Scanner scan = new Scanner(System.in);

		int 코드 = null;
		String 메뉴 = null;
		int 판매가격 = null;
		int 원가 = null;

		JavaProject.scan.nextLine();
		System.out.println("번호 입력 ");
		코드 = JavaProject.scan.nextInt();
		System.out.println("이름 입력");
		메뉴 = JavaProject.scan.next();
		System.out.println("성별 입력");
		판매가격 = JavaProject.scan.nextInt();
		System.out.println("비고 입력");
		원가 = JavaProject.scan.nextInt();

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AI","1234");

			System.out.println("DB 연결 성공");

			pstmt = conn.prepareStatement("INSERT INTO ACCOUNTING " + "(코드, 메뉴, 판매가격, 원가) " + "VALUES " + "(?,?,?,?)");
			pstmt.setInt(1, 코드);
			pstmt.setString(2, 메뉴);
			pstmt.setInt(3, 판매가격);
			pstmt.setInt(4, 원가);

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("에러 그 클래스 파일 없음");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
*/
//------------------------------------------------------------------------------------------------------------------------------

// 조회
	public void selectAccountingtable() {
		Connection conn = null; // DB 연결 객체
		PreparedStatement pstmt = null; // SQL 구문작성 객체
		ResultSet rs = null; // table 내용을 담는 객체

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AI","1234");

			pstmt = conn.prepareStatement("select * from ACCOUNTING");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getInt(3) + " ");
				System.out.println(rs.getInt(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
}