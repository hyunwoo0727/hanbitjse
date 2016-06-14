/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : Num1.java 
 * @story  : 
*/
public class Num1 {
	/***
	 * 학생수 입력
	 * 학생의 점수만 입력
	 * 최고점과 최저점
	 * @param args
	 */
	public static void main(String[] args) {
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		int cnt=0,max=0,min=100,i=0;
		int[] score;
		//-----------operation------------------//
		System.out.println("학생수를 입력하세요");
		cnt = scan.nextInt();
		score = new int[cnt];
		System.out.println("점수를 입력하세요");
		for (; i < cnt; i++) {
			score[i] = scan.nextInt();
			if(score[i] >= max){
				max = score[i];
			}
			if(score[i] <= min){
				min = score[i];
			}
		}
	
		//-----------console----------------//
		System.out.printf("최고점 : %d \t 최저점 : %d\n",max,min);
		
	}
}
