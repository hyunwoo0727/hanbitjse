/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : WhileLoopBase.java 
 * @story  : while basssssssssssssssse
*/
public class WhileLoopBase {
	
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		//-----------operation------------------//
		while(true){
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.출력 2.종료");
			switch (scan.nextInt()) {
			case 1:
				for (int i = 0; i < 5; i++) {
					System.out.printf("%s",(i+1));
				}
				break;
			case 2:
				System.out.println("종료합니다");
				return;
			default:
				System.out.println("1,2만 가능");
				break;
			}
			System.out.println();
		}
		//-----------console----------------//

	}
}
