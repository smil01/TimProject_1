package P3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import P4_DTO.PlayerDTO;
import P4_DTO.listAllDTO;

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
	public PlayerDTO SelectPlayer(int player_code) {
		con();

		sql = "select * from Player where Player_Code= ?";
		PlayerDTO result = null;

		try {
			pst = conn.prepareStatement(sql);

			pst.setInt(1, player_code);

			rs = pst.executeQuery();

			while (rs.next()) {
				result = new PlayerDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getBytes(5),
						rs.getString(6), rs.getInt(7), rs.getString(8));

			}
			close();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
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

	public ArrayList<PlayerDTO> selectGudanPlayera(int Group_Code) {
		con();
		sql = "select * from Player where Group_Code = ? ORDER BY PLAYER_CODE DESC";
		ArrayList<PlayerDTO> aplist = new ArrayList<PlayerDTO>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, Group_Code);

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

	public ArrayList<listAllDTO> selectGudanPlayerAbility(int Group_Code) {
		ArrayList<PlayerDTO> list = selectGudanPlayera(Group_Code);

		ArrayList<listAllDTO> result = new ArrayList<listAllDTO>();

		for (int i = 0; i < list.size(); i++) {
			con();

			try {
				sql = "select a.Player_Code, c.PLAYER_NAME, a.Player_Football_Speed, a.Player_Football_Shoot, a.Player_Football_Pass, a.Player_Football_Dribol, a.Player_Football_Defense, b.Player_Physical_Sex, b.Player_Physical_Age, b.Player_Physical_Height, b.Player_Physical_Weight, b.Player_Physical_LeftFoot, b.Player_Physical_RightFoot from "
						+ "(select * from Player_Football where PLAYER_CODE = ? and 1 = ROWNUM ORDER BY PLAYER_FOOTBALL_CODE desc) a, "
						+ "(select * from Player_Physical where PLAYER_CODE = ? and 1 = ROWNUM ORDER BY PLAYER_PHYSICAL_CODE desc) b, "
						+ "(select * from PLAYER where PLAYER_CODE = ?) c";

				pst = conn.prepareStatement(sql);

				pst.setInt(1, list.get(i).getPlayer_Code());
				pst.setInt(2, list.get(i).getPlayer_Code());
				pst.setInt(3, list.get(i).getPlayer_Code());

				rs = pst.executeQuery();

				while (rs.next()) {
					result.add(new listAllDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
							rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
							rs.getInt(12), rs.getInt(13)));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			close();
		}

		return result;
	}
	
	public ArrayList<PlayerDTO> searchGudanPlayera(String name) {
		con();
		sql = "select * from Player where player_name LIKE '%' || ? || '%' ORDER BY PLAYER_CODE DESC";
		ArrayList<PlayerDTO> aplist = new ArrayList<PlayerDTO>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);

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
	
	public ArrayList<listAllDTO> searchGudanPlayerAbility(int Group_Code, String name) {
		ArrayList<PlayerDTO> list = searchGudanPlayera(name);

		ArrayList<listAllDTO> result = new ArrayList<listAllDTO>();

		for (int i = 0; i < list.size(); i++) {
			con();

			try {
				sql = "select a.Player_Code, c.PLAYER_NAME, a.Player_Football_Speed, a.Player_Football_Shoot, a.Player_Football_Pass, a.Player_Football_Dribol, a.Player_Football_Defense, b.Player_Physical_Sex, b.Player_Physical_Age, b.Player_Physical_Height, b.Player_Physical_Weight, b.Player_Physical_LeftFoot, b.Player_Physical_RightFoot from "
						+ "(select * from Player_Football where PLAYER_CODE = ? and  Group_Code = ? and 1 = ROWNUM ORDER BY PLAYER_FOOTBALL_CODE desc) a, "
						+ "(select * from Player_Physical where PLAYER_CODE = ? and  Group_Code = ? and 1 = ROWNUM ORDER BY PLAYER_PHYSICAL_CODE desc) b, "
						+ "(select * from PLAYER where PLAYER_CODE = ? and  Group_Code = ?) c";

				pst = conn.prepareStatement(sql);

				pst.setInt(1, list.get(i).getPlayer_Code());
				pst.setInt(2, Group_Code);
				pst.setInt(3, list.get(i).getPlayer_Code());
				pst.setInt(4, Group_Code);
				pst.setInt(5, list.get(i).getPlayer_Code());
				pst.setInt(6, Group_Code);
				rs = pst.executeQuery();

				while (rs.next()) {
					result.add(new listAllDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
							rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
							rs.getInt(12), rs.getInt(13)));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			close();
		}

		return result;
	}
	
	public ArrayList<listAllDTO> VIPsearchGudanPlayerAbility(String name) {
		ArrayList<PlayerDTO> list = searchGudanPlayera(name);

		ArrayList<listAllDTO> result = new ArrayList<listAllDTO>();

		for (int i = 0; i < list.size(); i++) {
			con();

			try {
				sql = "select a.Player_Code, c.PLAYER_NAME, a.Player_Football_Speed, a.Player_Football_Shoot, a.Player_Football_Pass, a.Player_Football_Dribol, a.Player_Football_Defense, b.Player_Physical_Sex, b.Player_Physical_Age, b.Player_Physical_Height, b.Player_Physical_Weight, b.Player_Physical_LeftFoot, b.Player_Physical_RightFoot from "
						+ "(select * from Player_Football where PLAYER_CODE = ? and 1 = ROWNUM ORDER BY PLAYER_FOOTBALL_CODE desc) a, "
						+ "(select * from Player_Physical where PLAYER_CODE = ? and 1 = ROWNUM ORDER BY PLAYER_PHYSICAL_CODE desc) b, "
						+ "(select * from PLAYER where PLAYER_CODE = ?) c";

				pst = conn.prepareStatement(sql);

				pst.setInt(1, list.get(i).getPlayer_Code());
				pst.setInt(2, list.get(i).getPlayer_Code());
				pst.setInt(3, list.get(i).getPlayer_Code());

				rs = pst.executeQuery();

				while (rs.next()) {
					result.add(new listAllDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
							rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
							rs.getInt(12), rs.getInt(13)));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			close();
		}

		return result;
	}

}
