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
		int index=0;
		boolean flag = false;
		while(index<6){
			flag=false;
			lottoBean.setNumber();
			for (int j=0; j < winLotto.length; j++) {
				if(winLotto[j]==lottoBean.getNumber()){
					flag=true;
					break;
				}
			}
			if(!flag){
				winLotto[index] = lottoBean.getNumber();
				index++;
			}
		}
		Arrays.sort(winLotto);
	}
	@Override
	public int[] getLottoball() {
		// TODO Auto-generated method stub
		
		return winLotto;
	}

}
