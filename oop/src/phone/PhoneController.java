package phone;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		Phone phone = new Phone();
		CelPhone celPhone = new CelPhone();
		IPhone iPhone = new IPhone();
		AndroidPhone androidPhone = new AndroidPhone();
		while (true) {
			switch (JOptionPane.showInputDialog("1.유선폰 2.무선폰 3.아이폰 4.갤노트 0.종료")) {
			case "0":
				if(JOptionPane.showConfirmDialog(null, "종료?")==0){
					return;
				}
				break;
			case "1":
				phone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case "2":
				celPhone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
				celPhone.setCall(JOptionPane.showInputDialog("통화내용"));
				celPhone.setPortable(true);
				JOptionPane.showMessageDialog(null, celPhone.toString());
				break;
			case "3":
				iPhone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
				iPhone.setCall(JOptionPane.showInputDialog("통화내용"));
				iPhone.setData(JOptionPane.showInputDialog("문자내용"));
				iPhone.setPortable(true);
				JOptionPane.showMessageDialog(null, iPhone.toString());
				break;
			case "4":
				androidPhone.setData(JOptionPane.showInputDialog("통화내용"), JOptionPane.showInputDialog("사이즈"), JOptionPane.showInputDialog("카톡내용"));
				JOptionPane.showMessageDialog(null, androidPhone.toString());
				break;
			default:
				break;
			}
		}
		
	}
}
