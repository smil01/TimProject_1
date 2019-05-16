package P3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import P4_DTO.GroupsDTO;

public class GroupsDAO {
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

	public GroupsDTO SelectGroups(String Group_Name) {
		con();

		sql = "select * from Groups where Group_Name = ? ";
		GroupsDTO result_dto = new GroupsDTO();

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, Group_Name);

			rs = pst.executeQuery();

			while (rs.next()) {
				result_dto.setGroup_Code(rs.getInt(1));
				result_dto.setGroup_Name(rs.getString(2));
				result_dto.setGroup_Tel(rs.getString(3));
				result_dto.setGroup_Img_Bytes(rs.getBytes(4));
				result_dto.setGroup_LocalCode(rs.getInt(5));
				result_dto.setGroup_Address(rs.getString(6));
				result_dto.setGroup_HomePage(rs.getString(7));

			}
			return result_dto;
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();
		return null;
	}

//	GroupsDTO gdto = new GroupsDTO(group_Code, group_Name, group_Tel, group_Img, group_LocalCode, group_Address, group_HomePage)
	public void deleteGroups(GroupsDTO GroupsDTO) {
		con();
		
		
	}
	public int joinGroups(String tel, byte[] img, int localCode, String address, String homePage) { // DTO�� ������ ���� ����
																									// ������ null�̱⶧���� db��
																									// �ڵ����� null�� ��
		con();
		// ���� ���������� �� insert���� �Ҷ��� ������ �����Ͽ��� �÷����� �� ����Ͽ� �ٰ�, �ݵ�� ��ü �÷��� ���� insert�ϴ� ����
		// �幰�� �����̴�.
		sql = "INSERT INTO Groups(Group_tel, Groups_Img, Groups_LocalCode, Group_Address, Group_Homepage)"
				+ " VALUES(?,?,?,?,?)";

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, tel);
			pst.setBytes(2, img);
			pst.setInt(3, localCode);
			pst.setString(4, address);
			pst.setString(5, homePage);

			cnt = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return cnt;
	}


}
