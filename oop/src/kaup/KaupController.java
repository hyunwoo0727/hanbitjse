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
		Kaup kaup2 = new Kaup();
		//-----------operation------------------//
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.kaup")) {
			case "0":
				JOptionPane.showConfirmDialog(null, "종료?");
				return;
			case "1":
				kaup2.setName(JOptionPane.showInputDialog("이름"));
				kaup2.setHeight(JOptionPane.showInputDialog("키(cm)"));
				kaup2.setWeight(JOptionPane.showInputDialog("몸무게(kg)"));
				
				JOptionPane.showMessageDialog(null, kaup2.getKaup());
				break;
			default:
				break;
			}
		}
		

	}
}
