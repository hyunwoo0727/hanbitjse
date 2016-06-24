package lotto2;

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
