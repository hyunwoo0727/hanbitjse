package phone;

/**
 * @date   : 2016. 6. 22.
 * @author : HyunWoo Lee
 * @file   : CelPhone.java 
 * @story  : 
*/
public class CelPhone extends Phone {
	private String move;
	private boolean portable;
	public final static String KIND = "무선전화기";
	
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if(portable){
			this.setMove("이동가능");
		}else{
			this.setMove("이동불가");
		}
		this.portable = portable;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	@Override
	public String toString() {
		return KIND +"이기 때문에 "+move + ", " + super.getCompany() + " 제품을 가지고 " + super.getCall() + " (이)라고 통화했다";
	}
	
}
