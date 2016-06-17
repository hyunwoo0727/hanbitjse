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
	
	public Something(String aaa,String bbb,int ccc,int ddd){
		
		this.aaa = aaa;
		this.bbb = bbb;
		this.ccc = ccc;
		this.ddd = ddd;
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
	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	public int getCcc() {
		return ccc;
	}
	public int getDdd() {
		return ddd;
	}
	
	
	
}
