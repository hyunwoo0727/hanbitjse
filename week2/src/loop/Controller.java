/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : Controller.java 
 * @story  : 
*/
public class Controller {
	private static int result;
	private static String opCode;

	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		//-----------operation------------------//
		
		
		while (true) {
			System.out.println("메뉴를 선택하셈");
			System.out.println("1.계산기");
			System.out.println("2.카우푸 구하기");
			System.out.println("3.년 월말 구하기");
			System.out.println("0.종료");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("SYSTEM OFF");
				return;
			case 1:
				
				System.out.print("연산할 첫 번째 숫자를 입력하셈 : ");
				int op1 = scan.nextInt();
				System.out.print("연산 명령을 입력하세요(1.더하기 2.빼기 3.곰셉 4.나누기 5.나머지 기타.종료) : ");
				int opCodeNum = scan.nextInt();		
				System.out.print("연산할 두 번째 숫자를 입력하셈 : ");
				int op2 = scan.nextInt();
				
				if(opCodeNum==1){
					result = op1 + op2;
					opCode = "+";
				}else if (opCodeNum==2) {
					result = op1 - op2;
					opCode = "-";
				}else if(opCodeNum==3){
					result = op1 * op2;
					opCode = "*";
				}else if(opCodeNum==4){
					result = op1 / op2;
					opCode = "/";
				}else{
					result = op1 % op2;
					opCode = "%";
				}
				System.out.println(op1+" "+opCode+" "+op2+" = " + result + " 입니다.");	
				break;
			case 2:
				String name="",result="";
				double height=0.0,weight=0.0,kaup=0.0;
				System.out.println("이름?");
				name = scan.next();
				System.out.println("키?");
				height = scan.nextDouble();
				System.out.println("몸무게?");
				weight = scan.nextDouble();
				kaup = weight / (height / 100) / (height / 100);
				
				if (kaup < 18.5) {
					result = "저체중";
				}else if(kaup < 22.9 && kaup > 18.5){
					result = "정상";
				}else if(kaup < 24.9 && kaup > 23.0){
					result = "위험체중";
				}else if(kaup < 29.9 && kaup > 25.0){
					result = "비만1단계";
				}else if(kaup < 40 && kaup > 30.0){
					result = "비만2단계";
				}else if(kaup >= 40){
					result = "비만3단계";
				}
				System.out.printf("%s님의 BMI지수는 %.2f이고 %s 입니다",name,kaup,result);
				break;
			case 3:
				int lastDay=28,year=0,month=0;;
				System.out.print("년을 입력하세요(ex:2016) : ");
				year = scan.nextInt();
				System.out.print("월을 입력하세요(ex:2,10,11) : ");
				month = scan.nextInt();
				
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
				break;
			default:
				System.out.println("잘못입력했음다");
				break;
			}
		}
		
		//-----------console----------------//

	}
}
