package gameRps;

public class RpsServiceImpl implements RpsService{
	RPSBean rpsBean;
	
	@Override
	public void betPlayValue(int playValue) {
		rpsBean = new RPSBean(playValue);
	}
	@Override
	public void whoWin() {
		switch (rpsBean.getPlayerValue()-rpsBean.getComValue()) {
		case 0: rpsBean.setWinner("무승부"); break;
		case -1: case 2: rpsBean.setWinner("컴퓨터 승"); break;
		default: rpsBean.setWinner("사용자 승"); break;
		}
	}

	@Override
	public String showResult() {
		return rpsBean.toString();
	}
	@Override
	public void setCompValue() {
		rpsBean.setComValue((int)(Math.random()*3+1));
	}
	@Override
	public boolean validation(String sRps) {
		// TODO Auto-generated method stub
		int rps = Integer.parseInt(sRps);
		return rps==1||rps==2||rps==3 ? true : false;
	}
	
}
