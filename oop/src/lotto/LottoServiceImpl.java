package lotto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LottoServiceImpl implements LottoService  {
	private int[][] Lottos;
	private int count;
	private String serialNo = "C:\\lotto\\";
	private File file;
	
	@Override
	public void setLottos(LottoBean lot) {
		count = this.getCount(lot);
		if(count <= 0){
			this.Lottos = null;
			return;
		}
		Lottos = new int[count][6];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < Lottos[i].length; j++) {
				lot.setNumber();
				if(isDuplication(i,lot.getNumber())){
					j--;
					continue;
				}
				Lottos[i][j] = lot.getNumber();
			}
			sort(Lottos[i]);
		}	
	}
	@Override
	public int[][] getLottos() {
		// 로또를 가져온다 
		return Lottos;
	}
	@Override
	public boolean isDuplication(int row,int num) {
		// 중복방지
		for (int i = 0; i < Lottos[row].length; i++) {
			if(Lottos[row][i]==num){
				return true;
			}
		}
		return false;
	}
	@Override
	public void sort(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	@Override
	public void createFile() {
		// TODO Auto-generated method stub
		serialNo = serialNo + (int)(Math.random()*999999+100000) + ".txt";
		file = new File(serialNo);
		BufferedWriter bw=null;
		try {
			bw = new BufferedWriter(new FileWriter(file,false));
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < Lottos.length; i++) {
				for (int j = 0; j < Lottos[i].length; j++) {
					sb.append(j==Lottos[i].length-1 ? Lottos[i][j] : Lottos[i][j]+":");
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
	}
	@Override
	public String readFile()  {
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
		return sb.toString();
	}
	@Override
	public int getCount(LottoBean lot) {
		// TODO Auto-generated method stub
		return lot.getMoney()/1000;
	}
}
