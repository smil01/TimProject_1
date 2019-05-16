package P6_Temp;

import P3_DAO.Player_TransferDAO;
import P4_DTO.Player_TransferDTO;

public class testTransfer {

	public static void main(String[] args) {
		Player_TransferDAO dao = new Player_TransferDAO();
		int cnt = dao.transferJoin(new Player_TransferDTO(0, 2, 9999, 9998, 0));
		
		System.out.println(cnt);
	}

}
