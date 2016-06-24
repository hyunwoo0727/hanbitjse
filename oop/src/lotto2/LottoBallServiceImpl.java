package lotto2;

import java.util.Arrays;

public class LottoBallServiceImpl implements LottoBallService {
	private int[] winLotto;
	private LottoBean lottoBean;
	
	public LottoBallServiceImpl() {
		winLotto = new int[6];
		lottoBean = new LottoBean();
	}
	@Override
	public void setLottoball() {
		// TODO Auto-generated method stub	
		int index=0;
		boolean flag = false;
		while(index<6){
			flag=false;
			lottoBean.setNumber();
			for (int j=0; j <= index; j++) {
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
