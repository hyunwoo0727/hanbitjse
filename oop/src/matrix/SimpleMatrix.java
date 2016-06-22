package matrix;

public class SimpleMatrix {
	public static void main(String[] args) {
		/*for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {				
				System.out.print(j + "*" + i + "="+  i*j+"\t");	
			}
			System.out.println();
		}*/
	/*	int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num++ + "\t");
			}
			System.out.println();
		}
		*/
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j < 10; j++) {
				for (int k = 2+(4*i); k < 6+(4*i); k++) {
					System.out.print(k + "*" + j + "=" + j*k + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		int num = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num+=5;
				System.out.print(num + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
