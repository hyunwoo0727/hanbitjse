/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 9.
 * @author : HyunWoo Lee
 * @file : MonthEnd.java
 * @story : 월말일 클래스임
 */
public class MonthEnd2 {
	/**
	 * 월 입력 말일 몇일 알려주는 pg 단 2월은 29일로 한정함 1~12를 벗어난 숫자를 입력하면 잘못된 입력값입니다 라고 뜬다.
	 */

	public static void main(String[] args) {

		int month = 0, mEndDay = 31;
		Scanner scan = new Scanner(System.in);

		System.out.println("월을 입력하셈 : ");
/*
		switch (month) {
		case 2:
			mEndDay = 29;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			mEndDay = 30;
			break;
		default:
			if (month > 12 || month < 1) {
				System.out.println("월은 1~12만 입력 가능함.");
				return;
			}
		}*/

		switch (month=scan.nextInt()) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			mEndDay = 31;
			break;	
		case 4:case 6:case 9:case 11:
			mEndDay = 30;
			break;
		case 2:
			mEndDay = 29;
			break;
		default:
			System.out.println("월은 1~12만 입력 가능함.");
			return;
		}

		System.out.println(mEndDay + "일 입니다.");
		
	}
}
