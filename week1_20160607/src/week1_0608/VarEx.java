package week1_0608;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : VarEx.java 
 * @story  : 더하기
*/
public class VarEx {
	
	
	public static void main(String[] args) {
		int x=0,y=0,z=0;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("X값을 입력하셈 = ");
			x = scanner.nextInt();
		
			System.out.println("Y값을 입력하셈 = ");
			y = scanner.nextInt();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("정수만 입력 가능함다");
			System.exit(1);
		}
		z = x * y;
		System.out.println("x + y = " + z);
		
		
		
		
		
		
		
	}
	
	
	
}
