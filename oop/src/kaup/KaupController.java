/**
 * 
 */
package kaup;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   : 2016. 6. 15.
 * @author : HyunWoo Lee
 * @file   : KaupController.java 
 * @story  : 
*/
public class KaupController {
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner s = new Scanner(System.in);
		Kaup2 kaup2 = new Kaup2();
		//-----------operation------------------//
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.kaup")) {
			case "0":
				JOptionPane.showConfirmDialog(null, "종료?");
				return;
			case "1":
				System.out.println(kaup2.getKaup(JOptionPane.showInputDialog("이름"), JOptionPane.showInputDialog("키(cm)"), JOptionPane.showInputDialog("몸무게(kg)")));
				break;
			default:
				break;
			}
		}
		

	}
}
