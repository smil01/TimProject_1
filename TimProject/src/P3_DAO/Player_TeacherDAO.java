package P3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import P4_DTO.PlayerTeacherDTO;

public class Player_TeacherDAO {
	private String sql;
	private String sql2;
	private int cnt;
	private Connection conn;
	private PreparedStatement pst;
	private PreparedStatement pst2;
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

	public int joinPlayer(PlayerTeacherDTO dao) { // DTO�� ������ ���� ���� ������ null�̱⶧���� db�� �ڵ����� null�� ��
		con();
		// ���� ���������� �� insert���� �Ҷ��� ������ �����Ͽ��� �÷����� �� ����Ͽ� �ٰ�, �ݵ�� ��ü �÷��� ���� insert�ϴ� ����
		// �幰�� �����̴�.
		sql = "INSERT INTO PLAYER_Teacher(Player_Teacher_Code,Player_Code,Group_Code,Player_Teacher_Title,Player_Teacher_Content)"
				+ " VALUES(PLAYER_Teacher_SEQUENCE.nextval,?,?,?,?,?)";

		try {
			pst = conn.prepareStatement(sql);

			pst.setInt(1, dao.getPlayer_Teacher_Code());
			pst.setInt(2, dao.getPlayer_Code());
			pst.setInt(3, dao.getGroup_Code());
			pst.setString(4, dao.getPlayer_Teacher_Title());
			pst.setString(5, dao.getPlayer_Teacher_Content());

			cnt = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return cnt;
	}

	// �̸� ��ȸ
	public ArrayList<PlayerTeacherDTO> SelectPlayer(int player_code) {
		con();

		sql = "select * from Player_Teacher where Player_Code= ?";
		ArrayList<PlayerTeacherDTO> plist = new ArrayList<PlayerTeacherDTO>();

		try {
			pst = conn.prepareStatement(sql);

			pst.setInt(1, player_code);

			rs = pst.executeQuery();

			while (rs.next()) {
				plist.add(new PlayerTeacherDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4),
						rs.getString(5)));

			}
			close();
			return plist;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// ��ü ��ȸ
	public ArrayList<PlayerTeacherDTO> selectallPlayer() {
		con();

		sql = "select * from Player_Teacher";
		ArrayList<PlayerTeacherDTO> aplist = new ArrayList<PlayerTeacherDTO>();

		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				aplist.add(new PlayerTeacherDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4),
						rs.getString(5)));
			}
			close();
			return aplist;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}