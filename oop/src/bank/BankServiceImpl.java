package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date   :2016. 6. 27.
 * @author :HyunWoo Lee
 * @file   :BankServiceImple.java
 * @story  :
*/

public class BankServiceImpl implements BankService{
	private List<AccountBean> accountList;
	
	public BankServiceImpl() {
		// TODO Auto-generated constructor stub
		accountList = new ArrayList<AccountBean>();
	}
	@Override
	public void openAccount(AccountBean accountBean) {
		accountList.add(accountBean);
	}
	@Override
	public List<AccountBean> AccountList() {
		return accountList;
	}
	@Override
	public AccountBean findByAccountNO(String accoutNo) {
		AccountBean acBean = null;
		for (AccountBean accountBean : accountList) {
			if(accountBean.getAccount()==Integer.parseInt(accoutNo)){
				return accountBean;
			}
		}
		return acBean;
	}
	@Override
	public List<AccountBean> findByName(String name) {
		List<AccountBean> list = new ArrayList<AccountBean>();
		for (AccountBean accountBean : accountList) {
			if(accountBean.getName().equals(name)){
				list.add(accountBean);
			}
		}
		return list;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return accountList.size();
	}
	@Override
	public void showAccount() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String updateAccount(AccountBean accountBean) {
		for (AccountBean searchBean : accountList) {
			if(searchBean.getAccount()==accountBean.getAccount()){
				searchBean.setPw(accountBean.getPw());
				return "변경 완료!";
			}
		}
		return "비밀번호가 일치하지 않습니다";
	}
	@Override
	public String closeAccount(String accountNo,String pw) {
		for (AccountBean accountBean : accountList) {
			if(accountBean.getAccount()==Integer.parseInt(accountNo)&&accountBean.getPw().equals(pw)){
				accountList.remove(accountBean);
				return "삭제하였습니다";
			}
		}
		return "비밀번호가 일치하지 않습니다";
	}
}
