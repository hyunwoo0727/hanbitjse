/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : ArrAssign.java 
 * @story  : 
*/
public class ArrAssign2 {
	/**
	 * 전교생이 5명인 학생의 이름과 나이를
	 * 입력받고 이것을 출력하세염 
	 * */
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		int i=0;
		String[] arrStu = new String[5];
		int[] arrAge =  new int[5];
		//-----------operation------------------//
		
		for(;i < arrStu.length ; i++){
			System.out.print("학생 이름 입력 : ");
			arrStu[i] = scan.next();
			System.out.print("나이 입력 : ");
			arrAge[i] = scan.nextInt();
			
		}
		i=0;
		
		//-----------console----------------//

		for(;i < arrStu.length;i++){
			System.out.printf("%s - %d세\n",arrStu[i],arrAge[i]);
		}

	}
}
