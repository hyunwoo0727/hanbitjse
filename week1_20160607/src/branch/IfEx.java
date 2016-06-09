/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : IfEx.java 
 * @story  : 
*/
public class IfEx {
	public static void main(String[] args) {
		int input=0;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		if (input > 10) {
			System.out.println("입력된 정수값 "+input+"이 10보다 큽니다");
		} else {
			System.out.println("입력된 정수값 "+input+"이 10보다 작습니다");
		}
	}
}
