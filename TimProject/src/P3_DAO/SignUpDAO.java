package P3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import P4_DTO.SignUpDTO;

public class SignUpDAO {
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

	// ȸ���������� �ߺ��˻縦 �ϴ°��̴� is+�˻��+�ߺ��˻簡 �ʿ��� �޼�������� �۸�����
	public boolean isEmailJoin(String Member_Email) {
		con();

		sql = "select Member_Email from Member where Member_Email = ?";

		String result2 = null;

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, Member_Email);

			rs = pst.executeQuery();

			while (rs.next()) {
				result2 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		if (result2 != null) { //�ɼ� ������ ������ �ۿ��� ������. �ȱ׷��� close�� �ȵǼ� ������ �غ�����
			return true; // �ߺ��� ���� ������ true
		} else {
			return false; // �ߺ��� ���� ������ false
		}
	}

	public int join(SignUpDTO SignUpDTO) { // DTO�� ������ ���� ���� ������ null�̱⶧���� db�� �ڵ����� null�� ��
		con();
		// ���� ���������� �� insert���� �Ҷ��� ������ �����Ͽ��� �÷����� �� ����Ͽ� �ٰ�, �ݵ�� ��ü �÷��� ���� insert�ϴ� ����
		// �幰�� �����̴�.
		sql = "INSERT INTO Member(Member_Email, Group_Code, Member_Nickname, Member_Pw, Member_Tel, Member_LocalCode, Member_Address, Member_Img, View_Power) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, SignUpDTO.getMember_Email());
			pst.setInt(2, SignUpDTO.getGroup_Code());
			pst.setString(3, SignUpDTO.getMember_Nickname());
			pst.setString(4, SignUpDTO.getMember_Pw());
			pst.setString(5, SignUpDTO.getMember_Tel());
			pst.setInt(6, SignUpDTO.getMember_LocalCode());
			pst.setString(7, SignUpDTO.getMember_Address());
			pst.setBytes(8, SignUpDTO.getMember_Img()); // �̹����� byte�迭�̱� ������ Bytes
			pst.setInt(9, SignUpDTO.getView_Power());

			cnt = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		close();

		return cnt;
	}
	

	

}