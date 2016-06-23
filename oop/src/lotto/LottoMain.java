package lotto;

import javax.swing.JOptionPane;

public class LottoMain {
	public static void main(String[] args) {
		LottoBean lottoBean = new LottoBean();
		LottoService service = new LottoServiceImpl();
		lottoBean.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마 구입")));
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[j][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
