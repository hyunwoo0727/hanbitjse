package simpleRPS1;

import java.util.Random;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
		SimpleRPSService service = new SimpleRPSServiceImpl();
		String result = "";
		Random r = new Random();
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO?")) {
			case 0:
				String p = JOptionPane.showInputDialog("1가위2바위3보");
				result = service.gameEngine(result, r, p);
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				return;
			}
		}
	}
}
