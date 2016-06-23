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
	private static String FILE_NAME = "C:\\hwooo\\eclipse\\lotto.txt";
	private File file;
	
	@Override
	public void setLottos(LottoBean lot) {
		count = lot.getMoney()/1000;
		if(count <= 0){
			this.Lottos = null;
			return;
		}
		Lottos = new int[count][6];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < Lottos[i].length; j++) {
				lot.setNumber((int)(Math.random()*45 + 1));
				if(isDuplication(Lottos[i],lot.getNumber())){
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
	public boolean isDuplication(int[] arr,int num) {
		// 중복방지
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num){
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
	public String showLottos(){
		String result="";
		for (int i = 0; i < Lottos.length; i++) {
			for (int j = 0; j < Lottos[i].length; j++) {
				result += j==Lottos[i].length-1 ? Lottos[i][j] : Lottos[i][j]+":";
			}
			result += "\r\n";
		}
		return result;
	}
	@Override
	public void createFile() {
		// TODO Auto-generated method stub
		file = new File(FILE_NAME);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,false));
			bw.write(showLottos());
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String readFile()  {
		String line = "";
		String message = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line=br.readLine()) != null){
				message += line+"\n";
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return message;
	}
}
