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
				System.out.print("���Ἲ��->");
			} else {
				System.out.println("�������->");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
				System.out.print("rs����->");
			}
			if (pst != null) {
				pst.close();
				System.out.print("pst����->");
			}
			if (conn != null) {
				conn.close();
				System.out.print("conn����->");
			}
			System.out.println("Ŭ���");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int joinPlayer(PlayerDTO PlayerDTO) { // DTO�� ������ ���� ���� ������ null�̱⶧���� db�� �ڵ����� null�� ��
		con();
		// ���� ���������� �� insert���� �Ҷ��� ������ �����Ͽ��� �÷����� �� ����Ͽ� �ٰ�, �ݵ�� ��ü �÷��� ���� insert�ϴ� ����
		// �幰�� �����̴�.
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

	// ����ũ~ Ű���� ��ȸ
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

	// �̸� ��ȸ
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

	// ��ü ��ȸ
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
