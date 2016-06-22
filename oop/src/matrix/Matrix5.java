package matrix;

public class Matrix5 {
	public static void main(String[] args) {
		int[] iArray = new int[5];
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = i+1;
		}
		int[][] arr = new int[2][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
}
