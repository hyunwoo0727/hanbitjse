/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : HyunWoo Lee
 * @file   : MonthEnd3.java 
 * @story  : 
*/
public class MonthEnd3 {
	/**
	 * 년,월을 입력하면 말일이 몇일인지 알려주는
	 * 프로그램.
	 * 단, 윤년 2월은 29일이고 나머지해는 28일로 해줘요 
	 * 1~12를 벗어난 숫자를 입력하면
	 * 잘못된 입력값입니다 라고 뜬다.
	 * */
	public static void main(String[] args) {
		// --------init---------
		Scanner scanner = new Scanner(System.in);
		int lastDay=28,year=0,month=0;;
		//---------op --------
		System.out.print("년을 입력하세요(ex:2016) : ");
		year = scanner.nextInt();
		System.out.print("월을 입력하세요(ex:2,10,11) : ");
		month = scanner.nextInt();
//		year = Integer.parseInt(inputCal.substring(0, inputCal.indexOf("-")));
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			lastDay = 31;
			break;
		case 2:
			lastDay = (year%4==0 && year%100!=0) || year%400==0  ? 29:28;
			break;
		case 4:case 6:case 9:case 11:
			lastDay = 30;
			break;
		default:System.out.println("잘못 입력 되었습니다");
			return;
		}
		System.out.println(lastDay+"일");
		
	}	
}
