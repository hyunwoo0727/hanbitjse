/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   : 2016. 6. 15.
 * @author : HyunWoo Lee
 * @file   : Contoller.java 
 * @story  : 
*/
public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		Score scr = new Score();
		while (true) {
			System.out.println("[메뉴]"
					+ "1."
					+ "2."
					+ "3.최고최저점수"
					+ "0.종료");
			switch (s.next()) {
			case "1":
				System.out.print("num1, opcode(+,-,*,/,%) , num2 입력 : ");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "2":
				
				
				break;
			case "3":
				System.out.println("학생수 ? ");
				int[] score = new int[s.nextInt()];
				System.out.println("점수 ? ");
				for (int i = 0; i < score.length; i++) {
					score[i] = s.nextInt();
				}
				
				System.out.println("MAX : " + scr.getMax(score) + " | MIN : " + scr.getMin(score));
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료?????");
				return;
				
			default:
				break;
			}
			
		}

	}
}
