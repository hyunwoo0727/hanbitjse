/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : Calc.java 
 * @story  : 
*/
public class Calc2 {
	
	public static void main(String[] args) {
		/*
		 * 두 개의 정수를 입력받아서
		 * opcode 값이 1이면 덧셈 2면 뺄셈 3이면 곱셈 4면 나눗셈 5면 나머지
		 * 구하는 계산기
		 */
		
		int op1=0,op2=0,result=0,opCodeNum=0;
		String opCode ="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산할 첫 번째 숫자를 입력하셈 : ");
		op1 = scanner.nextInt();
		System.out.print("연산 명령을 입력하세요(1.더하기 2.빼기 3.곰셉 4.나누기 기타.나머지) : ");
		opCodeNum = scanner.nextInt();		
		System.out.print("연산할 두 번째 숫자를 입력하셈 : ");
		op2 = scanner.nextInt();
		
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
		
		/*System.out.print("연산 명령을 입력하세요(1.더하기 2.빼기 3.곰셉 4.나누기 기타.나머지) : ");
		opCodeNum = scanner.nextInt();

		switch (opCodeNum) {
		case 1:
			result = op1 + op2;
			opCode = "+";
			break;
		case 2:
			result = op1 - op2;
			opCode = "-";
			break;
		case 3:
			result = op1 * op2;
			opCode = "*";
			break;
		case 4:
			result = op1 / op2;
			opCode = "/";
			break;
		default:
			result = op1 % op2;
			opCode = "%";
			break;
		}*/
		
		System.out.println(op1+" "+opCode+" "+op2+" = " + result + " 입니다.");
		
		
	}
}
