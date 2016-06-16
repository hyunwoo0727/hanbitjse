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
		Account acnt = null;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.통장개설 2.입금 3.조회 4.출금 5.통장내역 0.종료")) {
			case "1":
				if(JOptionPane.showConfirmDialog(null, "계좌 개설?")==0){
					acnt = new Account(JOptionPane.showInputDialog("예금주:"));
					acnt.setId(JOptionPane.showInputDialog("아이디"));
					acnt.setPw(JOptionPane.showInputDialog("비밀번호"));
					JOptionPane.showMessageDialog(null,"고객님의 계좌번호는 " + acnt.getAccount()+" 입니다.");
					break;
				}
				break;
			case "2":
				if(acnt==null){
					JOptionPane.showMessageDialog(null, "통장부터 만드세요");
					break;
				}
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				acnt.setMoney(acnt.getMoney() + Integer.parseInt(inputMoney));
				break;
			case "3":
				if(acnt==null){
					JOptionPane.showMessageDialog(null, "통장부터 만드세요");
					break;
				}
				JOptionPane.showMessageDialog(null, "잔액 : " + acnt.getMoney() + "원");
				break;
			case "4":
				if(acnt==null){
					JOptionPane.showMessageDialog(null, "통장부터 만드세요");
					break;
				}
				
				String password = JOptionPane.showInputDialog("비밀번호를 입력하세요:");
				if(password.equals(acnt.getPw())){
					String withdrawal = JOptionPane.showInputDialog("출금액 ? : ");
					int iWithdrawal = Integer.parseInt(withdrawal);
					if(iWithdrawal > acnt.getMoney()){
						JOptionPane.showMessageDialog(null, "잔액이 부족합니다");
						break;
					}else{
						acnt.setMoney(acnt.getMoney() - iWithdrawal);
						JOptionPane.showMessageDialog(null, "출금 후 잔액 : " + acnt.getMoney());
					}
				}else{
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다");
					break;
				}
				break;
			case "5":
				if(acnt==null){
					JOptionPane.showMessageDialog(null, "통장부터 만드세요");
					break;
				}
				JOptionPane.showMessageDialog(null, Account.BANK_NAME + "\n계좌번호 : " + acnt.getAccount() + "\n예금주 : " + acnt.getName() + "\n아이디 : " + acnt.getId()+
						"\n잔액 : " + acnt.getMoney() + "원\n");
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
