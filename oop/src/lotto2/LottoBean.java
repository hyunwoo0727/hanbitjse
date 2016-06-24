package lotto2;

public class LottoBean {
	private int money,number;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber() {
		this.number = (int)(Math.random()*45 + 1);
	}
}
