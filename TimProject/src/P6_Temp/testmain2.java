package P6_Temp;

import P3_DAO.PlayerDAO;
import P4_DTO.PlayerDTO;

public class testmain2 {

	public static void main(String[] args) {
		PlayerDAO pdao = new PlayerDAO();
		pdao.insertPlayer(new PlayerDTO(-1, 1, "Drogba", "062-112", "C:\\Users\\USER\\Desktop\\ryan.jpg", "Drogba@chelsea.fb.club", 1, "°æºÏ ¿ï¸ª±º ¿ï¸ªÀ¾ µ¶µµ¸®"));
	}

}
