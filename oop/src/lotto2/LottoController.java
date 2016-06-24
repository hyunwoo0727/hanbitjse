package lotto2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LottoController {
	public static void main(String[] args){
		LottoBean lottoBean = new LottoBean();
		LottoService service = new LottoServiceImpl();
		File file=null;
		while (true) {
			switch (JOptionPane.showInputDialog("1.구입 2.출력 3.추첨 4.용지보기 0.종료")) {
			case "1":
				lottoBean.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마나 살래여?")));
				service.setLottos(lottoBean);
				break;
			case "2":
				String serialNo = "C:\\lotto\\" + (int)(Math.random()*999999+100000) + ".txt";;
				file = new File(serialNo);
				BufferedWriter bw=null;
				int[][] lottos = service.getLottos();
				try {
					bw = new BufferedWriter(new FileWriter(file,false));
					StringBuffer sb = new StringBuffer();
					for (int i = 0; i < lottos.length; i++) {
						for (int j = 0; j < lottos[i].length; j++) {
							sb.append(j==lottos[i].length-1 ? lottos[i][j] : lottos[i][j]+":");
						}
						sb.append("/");
					}
					String[] myLotto = sb.toString().split("/");
					for (String lots : myLotto) {
						lots += System.getProperty("line.separator");
						bw.write(lots);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						bw.flush();
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case "3":
				break;
			case "4":
				String line = "";
				StringBuffer sb = new StringBuffer();
				BufferedReader br=null;
				try {
					br = new BufferedReader(new FileReader(file));
					while((line=br.readLine()) != null){
						sb.append(line+"\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(null, sb.toString());
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
