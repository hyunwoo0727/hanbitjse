/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file : Tax.java
 * @story :
 */
public class Tax {
	/*
	 * 이름과 연봉을 입력받아서 연봉 xxx만원을 받으시는
	 *  xxx님께서 납부할 세금은 ???만원입니다.로 출력하는 pg만들어주셈
	 *  단 세율 정책이 바뀔때마다 변하니 관리자가 
	 *  쉽게 적용가능하도록 만들어주세요 현재는 세율이 9.7
	 */
	
	
	public static void main(String[] args) {
		
		String name = "";
		int salary = 0,tax=0;
		double taxRate= 0.097;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.nextLine();
		System.out.print("연봉을 입력하세요(만원) : ");
		salary = scanner.nextInt();
		
		tax = (int) (salary * taxRate);
		System.out.printf("연봉 %d만원을 받으시는 %s 님께서 납부할 세금은 %d만원임다\n"
							,salary,name,tax);
		System.out.println("연봉 "+salary+"만원을 받으시는 "+name+
				"님께서 납부할 세금은 "+tax+"만원입니다");
	}

}
