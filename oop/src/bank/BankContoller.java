/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date   : 2016. 6. 15.
 * @author : HyunWoo Lee
 * @file   : BankContoller.java 
 * @story  : 
*/
public class BankContoller {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.통장개설 2.입금 3.조회 4.출금 0.종료")) {
			case "1":
				
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				bank.setMoney(bank.getMoney() + Integer.parseInt(inputMoney));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, bank.getMoney());
				break;
			default:
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?")==0){
					JOptionPane.showMessageDialog(null, "SYSTEM OFF");
					return;
				}
				break;
			}
		}
	}
}
