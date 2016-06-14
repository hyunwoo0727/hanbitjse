/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : Controller.java 
 * @story  : 
*/
public class Controller {

	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		Kaup kaup = new Kaup();
		EndDay ed = new EndDay();
		//-----------operation------------------//
		while (true) {
			
			switch (JOptionPane.showInputDialog("1.계산기 2.카우푸 3.년 월말 0.종료")) {
			case "0":
				JOptionPane.showConfirmDialog(null, "종료할래여?");
				return;
			case "1":
				System.out.print("연산할 첫 번째 숫자 : ");
				System.out.print("연산 명령을 입력하세요(+ - * / %) : ");
				System.out.print("연산할 두 번째 숫자 : ");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "2":
				System.out.println("이름,신장,몸무게를 입력하세요 : ");
				System.out.println(kaup.getKaup(s.next(), s.nextDouble(), s.nextDouble()));
				break;
			case "3":
				System.out.println("년도,월을 입력하세요 : ");
				int result = ed.getEndDay(s.nextInt(), s.nextInt());
				if(result==-1){
					System.out.println("1~12만 가능");
					break;
				}else{
					System.out.println(result+"일 입니다");
					break;
				}
			default:
				System.out.println("잘못입력했음다");
				break;
			}
		}
		
		//-----------console----------------//

	}


}
