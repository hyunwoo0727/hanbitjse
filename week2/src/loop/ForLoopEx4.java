/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 13.
 * @author : HyunWoo Lee
 * @file   : ForLoop1.java 
 * @story  : 1~10 3배수 제외
*/
public class ForLoopEx4 {
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		int sum=0;
		//-----------operation------------------//
		for (int i = 1 ; i <= 10 ; i++) {
			if(i%3!=0){
				sum += i;
			}
		}	
		// 공차가 2인 1부터 10까지의 수열을 구하시오 
		
		//-----------console----------------//
		System.out.print(sum+"\t");
		
	}
}
