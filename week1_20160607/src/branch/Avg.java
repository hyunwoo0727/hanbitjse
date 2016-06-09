/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : Avg.java 
 * @story  : 
*/
public class Avg {
	
	public static void main(String[] args) {
		
		// 선언부,초기화 작업(initialize)
		int kuk=0,eng=0,math=0,total=0,avg=0;
		String name="",result="";
		Scanner scanner = new Scanner(System.in);
		//연산부 (operation,algorithm)------------------------------
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("국어 점수 : ");
		kuk = scanner.nextInt();
		System.out.print("영어 점수 : ");
		eng = scanner.nextInt();
		System.out.print("수학 점수 : ");
		math = scanner.nextInt();
		total = kuk+eng+math;
		avg = total/3;
		
		if (avg<60) {
			result="불합격";
		} else {
			result="합격";
		}
		//------출력부(console)-------------------------
		System.out.println(name+" : 총점 : "+total+"점, 평균 : " + avg + "점,"
				+ " 합격여부( " + result +" )");
	}
	
	
}
