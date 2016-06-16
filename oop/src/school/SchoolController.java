/**
 * 
 */
package school;

import javax.swing.JOptionPane;

/**
 * @date   : 2016. 6. 16.
 * @author : HyunWoo Lee
 * @file   : SchoolController.java 
 * @story  : 
*/
public class SchoolController {
	public static void main(String[] args) {
		// ssn 아이디 비번 이름 
		
		Student std = null;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록 2.조회 0.종료")) {
			case "1":
				String id = JOptionPane.showInputDialog("아이디");
				String pw1 = JOptionPane.showInputDialog("비밀번호");
				String pw2 = JOptionPane.showInputDialog("비밀번호를 한번더 입력해주세요");
				if(!pw1.equals(pw2)){
					JOptionPane.showMessageDialog(null, "비밀번호가 서로 다릅니다");
					break;
				}
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민등록번호(ex:880101-1");
				
				std = new Student(name,id,pw1,ssn);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "이름 : " + std.getName() 
				+ "\n아이디 : " + std.getId() + "\n성별 : " + std.getGender() +"\n나이 : " + std.getAge()	);
				break;
			case "0":
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?")==0){
					JOptionPane.showMessageDialog(null, "SYSTEM OFF");
					return;
				}
				break;
			default:
				break;
			}
		}
	}
}
