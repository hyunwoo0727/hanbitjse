package gameRps;

public class RPSBean {
	private String winner;
	private int comValue,playerValue;

	public RPSBean(int playValue){
		this.playerValue = playValue;
	}
	
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public int getComValue() {
		return comValue;
	}
	public void setComValue(int comValue) {
		this.comValue = comValue;
	}
	public int getPlayerValue() {
		return playerValue;
	}
	@Override
	public String toString() {
		String user="",comp="";
		switch (this.getPlayerValue()) {
		case 1:	user="가위"; break;
		case 2:	user="바위";break;
		default: user="보";break;
		}
		switch (this.getComValue()) {
		case 1:	comp="가위"; break;
		case 2:	comp="바위";break;
		default: comp="보";break;
		}
		
		return "결과 [승자=" + winner + ", 컴퓨터=" + comp + ", 플레이어=" + user + "]";
	}
	
	
	
	
	
	
}
