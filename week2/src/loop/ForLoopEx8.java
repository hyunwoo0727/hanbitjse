/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : ForLoop6.java 
 * @story  : init=0/limist=10,diff=2인 reverse sequence 
*/
public class ForLoopEx8 {
	public static void main(String[] args) {
		//-----------initializing------------------//
		int i=10;
		//-----------operation------------------//
		for (; i >= 0 ; i-=2) {
			System.out.print(i+"\t");
		}
		
		
		//-----------console----------------//
		System.out.println("");

	}
}
