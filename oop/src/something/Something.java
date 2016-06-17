/**
 * 
 */
package something;

/**
 * @date : 2016. 6. 17.
 * @author : HyunWoo Lee
 * @file : Something.java
 * @story :
 */
public class Something {
	private String aaa;
	private String bbb;
	private int ccc;
	private int ddd;
	
	public Something(String bbb,int ccc){
		
		this.bbb = bbb;
		this.ccc = ccc;
	}
	
	public String getAaa() {
		return aaa;
	}
	
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getBbb() {
		return bbb;
	}
	public int getCcc() {
		return ccc;
	}
	public int getDdd() {
		return ddd;
	}
	
	
	
}
