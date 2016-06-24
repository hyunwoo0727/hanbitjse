package lotto2;

public interface LottoService {
	public void setLottos(LottoBean lot);
	public int[][] getLottos();
	public boolean isDuplication(int row,int num);
	public void sort(int[] arr);
	public void createFile();
	public String readFile();
	public int getCount(LottoBean lot);
}
