package gameRps;

import javax.swing.JOptionPane;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsServiceImpl();
		
		while(true){
			switch (JOptionPane.showInputDialog("1.진행 0.종료")) {
			case "1":
				String rps = JOptionPane.showInputDialog("1.가위 2.바위 3.보 0.종료");
				if(!service.validation(rps)){
					JOptionPane.showMessageDialog(null, "잘못된 값입니다");
					break;
				}
				service.betPlayValue(Integer.parseInt(rps));
				service.setCompValue();
				service.whoWin();
				JOptionPane.showMessageDialog(null,service.showResult()); 
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
