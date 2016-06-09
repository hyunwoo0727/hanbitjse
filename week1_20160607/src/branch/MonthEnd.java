/**
 * 
 */
package branch;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @date : 2016. 6. 9.
 * @author : HyunWoo Lee
 * @file : MonthEnd.java
 * @story : 월말일 클래스임
 */
public class MonthEnd {
	/**
	 * 월 입력 말일 몇일 알려주는 pg 단 2월은 29일로 한정함 1~12를 벗어난 숫자를 입력하면 잘못된 입력값입니다 라고 뜬다.
	 */

	
	public static void main(String[] args) {

		int lastDay=0,month=0;
		Calendar cal = Calendar.getInstance();		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하시오 : ");
		month = scan.nextInt();
//		cal.set(Calendar.YEAR, cal.getTime().getYear());
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, 0);
		lastDay = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(lastDay+"일이 말일입니다");
	

	}
}
