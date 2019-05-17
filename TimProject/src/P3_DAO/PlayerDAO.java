package P3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import P4_DTO.PlayerDTO;

public class PlayerDAO {
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

	public int joinPlayer(PlayerDTO PlayerDTO) { // DTO로 받으면 값을 넣지 않으면 null이기때문에 db에 자동으로 null이 들어감
		con();
		// 정말 끔직하지만 꼭 insert문을 할때는 원래는 생략하였던 컬럼며을 다 기업하여 줄것, 반드시 전체 컬럼의 값을 insert하는 경우는
		// 드물기 때문이다.
		sql = "INSERT INTO player(player_code, Group_code, player_name, player_tel, player_img, player_Email, player_localCode, player_address)"
				+ " VALUES(PLAYER_SEQUENCE.nextval,?,?,?,?,?,?,?)";

		try {
			pst = conn.prepareStatement(sql);

			pst.setInt(1, PlayerDTO.getGroup_Code());
			pst.setString(2, PlayerDTO.getPlayer_Name());
			pst.setString(3, PlayerDTO.getPlayer_Tel());
			pst.setBytes(4, PlayerDTO.getPlayer_Img());
			pst.setString(5, PlayerDTO.getPlayer_Email());
			pst.setInt(6, PlayerDTO.getPlayer_LocalCode());
			pst.setString(7, PlayerDTO.getPlayer_Address());

			cnt = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return cnt;
	}

	// 라이크~ 키워드 조회
	public ArrayList<PlayerDTO> SearchPlayer(String player_name) {
		con();

		sql = "select * from player where player_name like  '%' || ? || '%'";
		ArrayList<PlayerDTO> lplist = new ArrayList<PlayerDTO>();

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, player_name);

			rs = pst.executeQuery();

			while (rs.next()) {
				lplist.add(new PlayerDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getBytes(5),
						rs.getString(6), rs.getInt(7), rs.getString(8)));

			}
			close();
			return lplist;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// 이름 조회
	public ArrayList<PlayerDTO> SelectPlayer(int player_code) {
		con();

		sql = "select * from Player where Player_Code= ?";
		ArrayList<PlayerDTO> plist = new ArrayList<PlayerDTO>();

		try {
			pst = conn.prepareStatement(sql);

			pst.setInt(1, player_code);

			rs = pst.executeQuery();

			while (rs.next()) {
				plist.add(new PlayerDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getBytes(5),
						rs.getString(6), rs.getInt(7), rs.getString(8)));

			}
			close();
			return plist;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// 전체 조회
	public ArrayList<PlayerDTO> selectallPlayer() {
		con();

		sql = "select * from Player";
		ArrayList<PlayerDTO> aplist = new ArrayList<PlayerDTO>();

		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				aplist.add(new PlayerDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getBytes(5),
						rs.getString(6), rs.getInt(7), rs.getString(8)));
			}
			close();
			return aplist;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
