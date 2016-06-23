package lotto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LottoController {
	public static void main(String[] args) throws IOException {
		LottoBean lottoBean = new LottoBean();
		LottoService service = new LottoServiceImpl();
		String fileName = "C:\\hwooo\\eclipse\\lotto.txt";
		File file = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1.구입 2.출력 3.추첨 4.용지보기 0.종료")) {
			case "1":
				lottoBean.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마나 살래여?")));
				service.setLottos(lottoBean);
				break;
			case "2":
				file = new File(fileName);
				BufferedWriter bw = new BufferedWriter(new FileWriter(file,false));
				bw.write(service.showLottos());
				bw.flush();
				bw.close();
				break;
			case "3":
				break;
			case "4":
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line = "";
				String message = "";
				while((line=br.readLine()) != null){
					message += line+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
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
