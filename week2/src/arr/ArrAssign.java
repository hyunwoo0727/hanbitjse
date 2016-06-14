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
public class ArrAssign {
	/**
	 * 전교생이 5명인 학생의 학번 이름과 나이를
	 * 입력받고 이것을 출력하세염 
	 * */
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		int i=0,cnt=0;
		String[] arrStu;
		int[] arrAge;
		//-----------operation------------------//
		System.out.println("학생 수가 몇 명입니까?");
		cnt = scan.nextInt();
		arrStu = new String[cnt];
		arrAge = new int[cnt];
		System.out.printf("%d 명의 학생 이름,나이를 입력 : ",cnt);
		for(;i < cnt ; i++){
			arrStu[i] = scan.next();
			arrAge[i] = scan.nextInt();
		}
		i=0;
		//-----------console----------------//
		System.out.println("====================");
		System.out.println("학번     |     이름    |     나이");
		for(;i < cnt;i++){
			System.out.printf("2016000%d\t%s\t\t%d세\n",i+1,arrStu[i],arrAge[i]);
		}
		System.out.println("====================");

	}
}
