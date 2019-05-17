package P3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import P4_DTO.loginDTO;
import P4_DTO.testDTO;

/**
 * 
 * @author : 오대근
 * @date : 2019. 5. 15.
 * @time : 오후 7:48:35
 * @content : 멤버테이블을 모델로 테스트 DAO작성 private String sql부터 closs() 까지는 꼭 똑같이 하며, 각
 *          메서드의 시작과 끝은 꼭 con()과 closs()를 넣을것
 * 
 */
public class loginDAO {
	private String sql;
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	private void con() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@192.168.0.23:1521:xe";
			String user = "hr";
			String password = "hr";

			this.conn = DriverManager.getConnection(url, user, password);

			if (this.conn != null) {
				System.out.print("연결성공->");
			} else {
				System.out.println("연결실패->");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
				System.out.print("rs해제->");
			}
			if (pst != null) {
				pst.close();
				System.out.print("pst해제->");
			}
			if (conn != null) {
				conn.close();
				System.out.print("연결해제->");
			}
			System.out.println("클로즈끝");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public loginDTO Login(loginDTO loginDTO) {
		con();

		sql = "select * from Member where Member_Email = ? and Member_Pw = ?";

		loginDTO result_dto = null;

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, loginDTO.getMember_Email());
			pst.setString(2, loginDTO.getMember_Pw());

			rs = pst.executeQuery();

			while (rs.next()) {
				result_dto = new loginDTO();
				result_dto.setMember_Email(rs.getString(1));
				result_dto.setGroup_Code(rs.getInt(2));
				result_dto.setMember_Nickname(rs.getString(3));
				result_dto.setMember_Pw(rs.getString(4));
				result_dto.setMember_Tel(rs.getString(5));
				result_dto.setMember_LocalCode(rs.getInt(6));
				result_dto.setMember_Address(rs.getString(7));
				result_dto.setMember_Img_bytes(rs.getBytes(8));
				result_dto.setView_Power(rs.getInt(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return result_dto;
	}
	

}
