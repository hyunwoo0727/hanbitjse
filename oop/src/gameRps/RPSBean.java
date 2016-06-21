package gameRps;

public class RPSBean {
	private String winner,value;
	private int comValue,playerValue;
	
	public RPSBean(){
	}
	
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
	public void setComValue() {
		this.comValue = (int)(Math.random()*3+1);
	}
	public int getPlayerValue() {
		return playerValue;
	}
	public String getValue(int out) {
		switch (out) {
		case 1:	return "가위"; 
		case 2:	return "바위";
		default: return "보";
		}
	}
	@Override
	public String toString() {
		
		return "결과 [승자=" + winner + ", 컴퓨터=" + this.getValue(comValue) + ", 플레이어=" + this.getValue(playerValue) + "]";
	}
}
