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
		AccountServiceImp1 acsv = new AccountServiceImp1();
		while (true) {
			switch (JOptionPane.showInputDialog("1.통장개설 2.입금 3.조회 4.출금 5.통장내역 6.계좌삭제 0.종료")) {
			case "1":
				String[] spec = JOptionPane.showInputDialog("예금주,ID,PW").split(",");
				acsv.openAccout(spec[0],spec[1],spec[2]);
				break;
			case "2":
				if(acsv.acnt==null){
					JOptionPane.showMessageDialog(null, "통장부터 만드세요");
					break;
				}			
				acsv.deposit(Integer.parseInt(JOptionPane.showInputDialog("입금액?")));
				break;
			case "3":
				if(acsv.acnt==null){
					JOptionPane.showMessageDialog(null, "통장부터 만드세요");
					break;
				}
				break;
			case "4":
				if(acsv.acnt==null){
					JOptionPane.showMessageDialog(null, "통장부터 만드세요");
					break;
				}
				JOptionPane.showMessageDialog(null,acsv.withDraw(Integer.parseInt(JOptionPane.showInputDialog("출금액 ? : "))));
				break;
			case "5":
				if(acsv.acnt==null){
					JOptionPane.showMessageDialog(null, "통장부터 만드세요");
					break;
				}
				JOptionPane.showMessageDialog(null, acsv.showAccount());
				break;
			case "6":
				acsv.closeAccount();
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
