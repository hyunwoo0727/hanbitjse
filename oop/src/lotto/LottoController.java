package lotto;

import javax.swing.JOptionPane;

public class LottoController {
	public static void main(String[] args) {
		LottoBean lottoBean = new LottoBean();
		LottoService service = new LottoServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1.구입 2.출력 3.추첨 0.종료")) {
			case "1":
				lottoBean.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마나 살래여?")));
				service.setLottos(lottoBean);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.getLottos()==null ? "금액이 부족합니다" : service.showLottos());
				break;
			case "3":
				lottoBean.setMoney(1000);
				service.setLottos(lottoBean);
				JOptionPane.showMessageDialog(null, service.showLottos());
				break;
			case "0":
				if(JOptionPane.showConfirmDialog(null, "종료할건가연?")==0){
					return;
				}
				break;
			default:
				break;
			}
		}
	}
}
