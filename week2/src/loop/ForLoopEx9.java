/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : ForLoop6.java 
 * @story  : init=0/limist=10,diff=1인 reverse sequence 
*/
public class ForLoopEx9 {
	public static void main(String[] args) {
		//-----------initializing------------------//
		int i=10;
		//-----------operation------------------//
		/*for (; i >= 0 ; i--) {
			System.out.print(i+"\t");
		}*/
		// 무한루프 테스트
		for (; i >= 0 ; i++) {
			System.out.print(i+"\t");
		}
		
		//-----------console----------------//
		System.out.println("");

	}
}
