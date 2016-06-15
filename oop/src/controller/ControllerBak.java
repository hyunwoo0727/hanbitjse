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
public class ControllerBak {

	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		Kaup kaup = new Kaup();
		EndDay ed = new EndDay();
		Grade grade = new Grade();
		Score scr = new Score();
		Tax tx = new Tax();
		Gender gender = new Gender();
		Time time = new Time();
		String[] arrName;
		int[] score;
		int cnt = 0,i=0;
		//-----------operation------------------//
		while (true) {
			
			switch (JOptionPane.showInputDialog("1.계산기 2.카우푸 3.년 월말 4.1등 구하기 5.학번/나이 6.최고죄저점수 7.세금액 8.성별판별 9.시분초구하기 0.종료")) {
			case "0":
				JOptionPane.showConfirmDialog(null, "종료할래여?");
				return;
			case "1":
				System.out.print("연산할 첫 번째 숫자 : ");
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
			case "4":
				System.out.println("학생 수를 입력하세요 : ");
				cnt=s.nextInt();
				arrName = new String[cnt];
				score = new int[cnt];
				System.out.print("이름/점수를 입력하세요 : ");
				
				for (i = 0; i < cnt; i++) {
					arrName[i] = s.next();
					score[i] = s.nextInt();
					if(score[i] > 100){
						System.out.println("다시 입력해!");
						i--;
					}
				}
				arrName = grade.getGrade(arrName, score);
				for (i = 0; i < cnt; i++) {
					System.out.printf("%d등 : %s\n",i+1,arrName[i]);
				}	
				break;
			case "5":
				// 5번 생략
				break;
			case "6":
				System.out.println("학생 수를 입력하세요 : ");
				cnt=s.nextInt();
				score = new int[cnt];
				System.out.println("점수를 입력하세요");
				for (i=0; i < cnt; i++) {
					score[i] = s.nextInt();
				}
				System.out.println("MAX : " + scr.getMax(score) + "  |   MIN : " + scr.getMin(score));
				break;
			case "7":
				System.out.println("이름,연봉을 입력하세요(만원)");
				String name= s.next();
				int salary = s.nextInt();
				System.out.printf("연봉 %d를 받으시는 %s님께서 납부할 세금은 %d만원 입니다\n",salary,name,tx.getTax(salary));
				break;
			case "8":
				System.out.print("주민번호 앞자리와 뒤의 한자리만 입력(ex:870727-1) : ");
				System.out.println(gender.getGender(s.next()) + "입니다");
				break;
			case "9":
				System.out.println("초를 입력하세요");
				System.out.println(time.getTime(s.nextInt()));
				break;
			default:
				System.out.println("잘못입력했음다");
				break;
			}
		}
		
		//-----------console----------------//

	}


}
