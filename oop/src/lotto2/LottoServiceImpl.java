package lotto2;

import java.util.Arrays;

public class LottoServiceImpl implements LottoService  {
	private int[][] Lottos;
	private int count;
	
	
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
			Arrays.sort(Lottos[i]);
//			sort(Lottos[i]);
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
	public int getCount(LottoBean lot) {
		// TODO Auto-generated method stub
		return lot.getMoney()/1000;
	}
}
