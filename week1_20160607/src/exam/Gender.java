/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : HyunWoo Lee
 * @file   : Gender.java 
 * @story  : 
*/
public class Gender {
	/**
	 * 주민번호 앞자리와 성별 판별 번호만 입력합니다
	 * ex) 800101-1 까지 입력하면
	 * 소비자가 자신이 남자인지 여자인지 밝히지 않아도
	 * 자동으로 db에 저장되는 시스템을 개발해주세요 
	 * */
	public static void main(String[] args) {
		//-----------initializing------------------//
		String sCode="",sName="";
		char gender ='여';
		Scanner scan = new Scanner(System.in);
		//-----------operation------------------//
		System.out.print("이름 : ");
		sName = scan.next();
		System.out.print("주민번호 앞자리와 뒤의 한자리만 입력(ex:870727-1) : ");
		sCode = scan.next();
		
		switch (sCode.charAt(sCode.length()-1)) {
		case '1':case '3':case '5':case '7':
			gender = '남';
			break;
		default:
			break;
		}
		
		//-----------console----------------//
		System.out.println(sName + "(" + gender+")");		

	}
}
