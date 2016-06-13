/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 13.
 * @author : HyunWoo Lee
 * @file   : ForLoop1.java 
 * @story  : 1~10 3배수 제외 not 금ㅣ
*/
public class ForLoopEx5 {
	public static void main(String[] args) {
		//-----------initializing------------------//
		//-----------operation------------------//
		for (int i = 1 ; i <= 10 ; i++) {
			if(i%3==0){
				continue; 
				// return = kill method   break = kill statement 
			}
			System.out.print(i+"\t");
		}	
		
		System.out.print("hi");
		//-----------console----------------//
		
	}
}
