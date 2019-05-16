package P7_Util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class passwordCheck {
	public static boolean checkPw(String inputPw) {
      
        if (inputPw == null || inputPw.equals("")) return false;
        if (inputPw.length() > 16) return false;
        if (inputPw.length()<8) return false;
			
		
       
        return true;
	}
}
