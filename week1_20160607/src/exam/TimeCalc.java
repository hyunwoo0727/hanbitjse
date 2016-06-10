/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : HyunWoo Lee
 * @file   : TimeCalc.java 
 * @story  : 
*/
public class TimeCalc {
	/**
	 * 타이머로 작업시간 기록하는데요
	 * 50000초로 나와요
	 * 근데 이게 감이 잘 안와서
	 * 시간 분 초로 나누어서 보게 해주세요
	 * 50000초가 입력되면
	 * 25시간 32분 15초 이렇게 보이게요.
	 * */
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		//-----------operation------------------//
		System.out.print("초를 입력해 주세요 : ");
		int sec = scan.nextInt();
		if(sec<0){
			System.out.println("양수를 입력하세요!!!");
			return;
		}
		//-----------console----------------//
		
		System.out.println(sec/3600 +"시간 " + sec/60%60 + "분 " + sec%60 +"초");
		
		
	}
}
