package P6_Temp;

import java.util.ArrayList;

import P3_DAO.Player_TransferDAO;
import P4_DTO.PlayerDTO;
import P4_DTO.Player_TransferDTO;

public class testTransfer {

	public static void main(String[] args) {
		Player_TransferDAO dao = new Player_TransferDAO();
//		int cnt = dao.transferJoin(new Player_TransferDTO(0, 1, 1, 9999, 0)); //이적신청
		
		int cnt = dao.transferOk(16); // 이적 동의
		
		System.out.println(cnt);
		
//		ArrayList<PlayerDTO> list = dao.transferTo(9999);
//		ArrayList<PlayerDTO> list2 = dao.transferFrome(9999);
//		
//		System.out.println("====== 이적 신청 대기중인 선수 ======");
//		for(PlayerDTO dto : list) {
//			System.out.println(dto);
//		}
//		
//		System.out.println("====== 이적 수락 대기중인 선수 ======");
//		for(PlayerDTO dto : list2) {
//			System.out.println(dto);
//		}
	}

}
