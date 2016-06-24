package lotto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LottoMain2 {
	public static void main(String[] args) {
		LottoBallService service = new LottoBallServiceImpl();
		
		service.setLottoball();
		
		
		File file = new File("C:\\lotto\\lotto.txt");
		BufferedWriter bw=null;
		int[] winLotto = service.getLottoball();
		try {
			bw = new BufferedWriter(new FileWriter(file,false));
			for (int i = 0; i < winLotto.length; i++) {
				bw.write(winLotto.length-1==i ? winLotto[i]+"" : winLotto[i] + ":");				
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
		
		System.out.print("당첨 번호 : ");
		for (int num : service.getLottoball()) {
			System.out.print(num + " ");
		}
	
	}
}
