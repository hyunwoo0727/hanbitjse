package simpleRPS5;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "===홀짝 게임===");
		SimpleRPSService service = new SimpleRPSServiceImpl();
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO?")) {
			case 0:
				JOptionPane.showMessageDialog(null,service.getResult(service.playGame(Integer.parseInt(JOptionPane.showInputDialog("1.홀 2.짝")))) );
				break;
			default:
				return;
			}
		}
	}
}
