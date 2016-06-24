package lotto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class LottoBallServiceImpl implements LottoBallService {
	private int[] winLotto;
	LottoBean lottoBean;
	
	@Override
	public void setLottoball() {
		// TODO Auto-generated method stub	
		winLotto = new int[6];
		lottoBean = new LottoBean();
		for (int i = 0; i < winLotto.length; i++) {
			lottoBean.setNumber();
			if(isDuplicate(lottoBean.getNumber())){
				i--;
				continue;
			}
			winLotto[i] = lottoBean.getNumber();
		}
		Arrays.sort(winLotto);
	
		File file = new File("C:\\lotto\\lotto.txt");
		BufferedWriter bw=null;
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
	}
	@Override
	public int[] getLottoball() {
		// TODO Auto-generated method stub
		
		return winLotto;
	}
	@Override
	public boolean isDuplicate(int num) {
		for (int i = 0; i < winLotto.length; i++) {
			if(winLotto[i]==num){
				return true;
			}
		}
		return false;
	}
}
