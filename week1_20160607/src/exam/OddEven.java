/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : HyunWoo Lee
 * @file   : OddEven.java 
 * @story  : 
*/
public class OddEven {
	/**
	 * 님, 홀짝 게임하나 만들어 주세요
	 * 사용자가 홀인지 짝인지 맞추면
	 * WIN 틀리면 LOSE  
	 * */
	
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		int num = new Random().nextInt(10)+1,selectNum=0;
		String result ="LOSE";
		//-----------operation------------------//
		System.out.println("홀일까 짝일까?(짝이면 0 홀이면 1) : ");
		selectNum = scan.nextInt();
		System.out.println("랜덤 수는 " + num);
		
		if(selectNum!=0 && selectNum !=1){
			System.out.println("0과 1만 입력 가능합니다");
			return;
		}
		if(selectNum==num%2){
				result = "WIN";
		}
		//-----------console----------------//
		System.out.println(result);

	}
}
