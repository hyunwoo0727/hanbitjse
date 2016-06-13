/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 13.
 * @author : HyunWoo Lee
 * @file   : ForLoop1.java 
 * @story  : 1~10 홀수급수 
*/
public class ForLoopEx3 {
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		//-----------operation------------------//
	/*	for (int i = 1 ; i <= 10 ; i++) {
			if(i%2!=0){
				sum += i;
			}
		}	*/
		
		for (int i = 1; i <= 10	; i+=2) {
			sum += i;
		}
		// 공차가 2인 1부터 10까지의 수열을 구하시오 
		
		//-----------console----------------//
		System.out.print(sum+"\t");
		
	}
}
