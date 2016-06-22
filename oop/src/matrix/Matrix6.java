package matrix;

public class Matrix6 {
	public static void main(String[] args) {
		int num = 0;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num+=5;
				mtx[i][j] = num;
				System.out.print(mtx[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
