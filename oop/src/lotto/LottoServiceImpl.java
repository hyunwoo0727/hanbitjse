package lotto;

public class LottoServiceImpl implements LottoService {
	private int[][] Lottos;
	private int count;
	
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
				int num = (int)(Math.random()*45 + 1);
				if(isDuplication(Lottos[i],num)){
					j--;
					continue;
				}
				Lottos[i][j] = num;
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
	
	
}
