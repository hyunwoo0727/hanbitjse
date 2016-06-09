package week1_0608;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : VarEx4.java 
 * @story  : 나누기
*/
public class VarEx4 {
	public static void main(String[] args) {

		double x = 0.0,y=0.0,z=0.0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("X값을 입력하셈 = ");
		x = scanner.nextDouble();

		System.out.println("Y값을 입력하셈 = ");
		y = scanner.nextDouble();
		
		z = x/y;
		
		System.out.println("X % Y = " + z);

	}
}
