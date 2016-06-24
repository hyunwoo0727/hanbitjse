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
		int i=0;
		while(i<6){
			lottoBean.setNumber();
			for (int j=0; j < winLotto.length; j++) {
				if(winLotto[j]==lottoBean.getNumber()){
					i--;
					continue;
				}
			}
			winLotto[i] = lottoBean.getNumber();
			i++;
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
