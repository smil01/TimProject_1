package P3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import P4_DTO.Player_TransferDTO;

public class Player_TransferDAO {
	private String sql;
	private int cnt;
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
				System.out.print("conn해제->");
			}
			System.out.println("클로즈끝");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 신청
	public int transferJoin(Player_TransferDTO dto) {
		con();

		sql = "insert into PLAYER_TRANSFER(Player_Transfer_Code, Player_Code, Now_Group_Code, Transfer_Group_Code, Player_Transfer_State) VALUES (PLAYER_TRANSFER_SEQUENCE.nextval, ?, ?, ?, 0)";

		try {
			pst = conn.prepareStatement(sql);

			pst.setInt(1, dto.getPlayer_Code());
			pst.setInt(2, dto.getNow_Group_Code());
			pst.setInt(3, dto.getTransfer_Group_Code());

			cnt = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return cnt;
	}

	// 수락
	public int transferOk(Player_TransferDTO dto) {
		con();

		sql = "insert into PLAYER_TRANSFER(Player_Transfer_Code, Player_Code, Now_Group_Code, Transfer_Group_Code, Player_Transfer_State) VALUES (PLAYER_TRANSFER_SEQUENCE.nextval, ?, ?, ?, 0)";

		try {
			pst = conn.prepareStatement(sql);

			pst.setInt(1, dto.getPlayer_Code());
			pst.setInt(2, dto.getNow_Group_Code());
			pst.setInt(3, dto.getTransfer_Group_Code());

			cnt = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return cnt;
	}
	
	
}
