/**
 * 
 */
package bank;

import java.util.Random;

/**
 * @date   : 2016. 6. 16.
 * @author : HyunWoo Lee
 * @file   : Account.java 
 * @story  : 
*/
public class Account {
	
		private String name;
		private String id;
		private String pw;
		private int    money;
		private int    accountNo;
		public final static String BANK_NAME = "국민은행";
		
		public Account(String name) {
			
			int accountNo = (int) (Math.random()*1000000+100001);
			if(accountNo > 1000000){
				accountNo -= 100000;
			}
		
			this.accountNo = accountNo;
			this.name = name;
			this.money = 0;
		}
		
		public String getName() {
			return name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPw() {
			return pw;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		public int getAccount() {
			return accountNo;
		}

}
