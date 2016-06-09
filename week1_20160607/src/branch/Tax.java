/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : Tax.java 
 * @story  : 
*/
public class Tax {
	public static void main(String[] args) {
		String name = "",selection;
		int salary = 0,tax=0;
		double taxRate= 0.097;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.next();
		System.out.print("연봉을 입력하세요(만원) : ");
		salary = scanner.nextInt();
		System.out.print("세율이 바뀜?(Y/N) : ");
		selection = scanner.next();
		
		if (selection.equalsIgnoreCase("n")) {
			tax = (int) (salary * taxRate);
			System.out.printf("연봉 %d만원을 받으시는 %s 님께서 납부할 세금은 %d만원임다\n"
								,salary,name,tax);
		}else{
			System.out.print("바뀐 세율을 입력하세요(%) : ");
			taxRate = scanner.nextDouble();
			taxRate = taxRate/100;
			tax = (int) (salary * taxRate);
			System.out.printf("연봉 %d만원을 받으시는 %s 님께서 납부할 세금은 %d만원임다\n"
								,salary,name,tax);
		}
		
		
		
		
	}
}
