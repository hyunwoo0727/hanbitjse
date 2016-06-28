package map;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

import com.sun.scenario.effect.AbstractShadow.ShadowMode;

/**
 * @date   :2016. 6. 28.
 * @author :HyunWoo Lee
 * @file   :MemberController.java
 * @story  :
*/

public class MemberController {
	public static void main(String[] args) {
		MemberService mService = new MemberServiceImpl();
		MemberBean tempBean = new MemberBean();
		Map<String, MemberBean> tempList = new HashMap<String,MemberBean>();
		String[] spec = null;
//		String search = ""; 출력용 일단 제외 
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "--- 회원이 보는 화면 ---\n"
					+ "1회원가입 2로그인 3.내정보 보기(로긴되있는 상태) 4내정보수정(비번) 5탈퇴 0종료\n"
					+ "--- 관리자 화면 ---\n"
					+ "11회원목록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수 ")) {
			case "1":
				spec = JOptionPane.showInputDialog("아이디,이름,비밀번호,성별(남/여) 입력").split(",");
				tempBean = new MemberBean(spec);
				JOptionPane.showMessageDialog(null,mService.join(tempBean));
				break;
			case "2": // 로그인(id/pw 입력)
				spec = JOptionPane.showInputDialog("아이디,비밀번호 입력").split(",");
				tempBean = new MemberBean();
				tempBean.setId(spec[0]);
				tempBean.setPw(spec[1]);
				JOptionPane.showMessageDialog(null, mService.login(tempBean));
				break;
			case "3": // 내정보보기
				JOptionPane.showMessageDialog(null, mService.detail());
				break;
			case "4": // 정보수정(비밀번호)
				spec = JOptionPane.showInputDialog("아이디,비밀번호 입력").split(",");
				tempBean.setId(spec[0]);
				tempBean.setPw(spec[1]);
				JOptionPane.showMessageDialog(null, mService.updatePw(tempBean));
				break;
			case "5": // 탈퇴
				JOptionPane.showMessageDialog(null, mService.delete(JOptionPane.showInputDialog("탈퇴할 아이디를 입력하세요")));
				break;				
			case "11": // 목록검색
				tempList = mService.list();
				JOptionPane.showMessageDialog(null, tempList.isEmpty()? "회원이 없습니다" : tempList);
				break;
			case "12": // 아이디로 검색
				tempBean = mService.findById(JOptionPane.showInputDialog("검색할 아이디를 입력하세요"));
				JOptionPane.showMessageDialog(null, tempBean==null ? "없는 아이디입니다" : tempBean);
				break;
			case "13": // 이름으로 검색 
				tempList = mService.findByName(JOptionPane.showInputDialog("검색할 이름을 입력하세요"));
				JOptionPane.showMessageDialog(null, tempList.isEmpty()? "해당 이름의 회원이 없습니다" : tempList);
				break;
			case "14":// 성별로 검색
				tempList = mService.findByGender(JOptionPane.showInputDialog("검색할 성별을 입력하세요"));
				JOptionPane.showMessageDialog(null, tempList.isEmpty()? "해당 성별의 회원이 없습니다" : tempList);
				break;
			case "15": // 회원수 
				JOptionPane.showMessageDialog(null, mService.count() + "명");
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
