package simpleRPS4;

public class SimpleRPSServiceImpl implements SimpleRPSService{
	SimpleRPSBean rps = new SimpleRPSBean();
	@Override
	public String playGame(int player) {
		String result = "";
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp();
		int ply = rps.getPlay();
		
		
		return result;
	}

	@Override
	public String getResult(String result) {
		
		return "플레이어 : "+rps.getValue(rps.getPlay())+"\n"
		+"컴퓨터 : "+rps.getValue(rps.getComp())+"\n"
		+this.playGame(rps.getPlay());
	}
}
