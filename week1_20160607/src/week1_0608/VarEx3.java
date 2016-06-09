package week1_0608;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : VarEx3.java 
 * @story  : 곱
*/
public class VarEx3 {
	public static void main(String[] args) {

		int x=0,y=0,z=0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("X값을 입력하셈 = ");
		x = scanner.nextInt();

		System.out.println("Y값을 입력하셈 = ");
		y = scanner.nextInt();
		
		z = x*y;
		
		System.out.println("X * Y = " + z);

	}
}
