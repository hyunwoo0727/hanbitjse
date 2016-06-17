/**
 * 
 */
package something;

import javax.swing.JOptionPane;


/**
 * @date   : 2016. 6. 17.
 * @author : HyunWoo Lee
 * @file   : SomethingController.java 
 * @story  : 
*/
public class SomethingController {
	public static void main(String[] args) {
		Something smt= null;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록 2.조회 0.종료")) {
			case "1":
				String aaa = JOptionPane.showInputDialog("aaa(문자)");
				String bbb = JOptionPane.showInputDialog("bbb(문자)");
				String ccc = JOptionPane.showInputDialog("ccc(숫자)");
				String ddd = JOptionPane.showInputDialog("ddd(숫자)");
				smt = new Something(aaa, bbb, Integer.parseInt(ccc), Integer.parseInt(ddd));
				break;
			case "2":
				if(smt==null){
					JOptionPane.showMessageDialog(null, "등록 먼저 해주세요");
					break;
				}
				JOptionPane.showMessageDialog(null, "aaa: " + smt.getAaa() + "\nbbb: " + smt.getBbb() +
						"\nccc: " + smt.getCcc() + "\nddd: " + smt.getDdd());
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
