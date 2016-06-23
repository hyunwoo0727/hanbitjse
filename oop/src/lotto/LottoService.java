package lotto;

public interface LottoService {
	public void setLottos(LottoBean lot);
	public int[][] getLottos();
	public boolean isDuplication(int[] arr,int num);
	public void sort(int[] arr);
	public String showLottos();
	public void createFile();
	public String readFile();
}
