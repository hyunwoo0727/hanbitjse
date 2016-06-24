package lotto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LottoBallAdmin {
	public static void main(String[] args) {
		LottoBallService service = new LottoBallServiceImpl();
		service.setLottoball();
		BufferedWriter bw=null;
		int[] winLotto = service.getLottoball();
		try {
			bw = new BufferedWriter(new FileWriter(new File("C:\\lotto\\lotto.txt"),false));
			for (int i = 0; i < winLotto.length; i++) {
				bw.write(winLotto.length-1==i ? String.valueOf(winLotto[i]) : winLotto[i] + ":");				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
}
