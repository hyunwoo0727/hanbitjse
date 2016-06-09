/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : GradeTest.java 
 * @story  : 
*/
public class GradeTest {
	public static void main(String[] args) {
		
		int kuk=0,eng=0,math=0,total=0,avg=0;
		String name="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("국어 점수 : ");
		kuk = scanner.nextInt();
		System.out.print("영어 점수 : ");
		eng = scanner.nextInt();
		System.out.print("수학 점수 : ");
		math = scanner.nextInt();
		total = kuk+eng+math;
		avg = total/3;
		
		System.out.println(name+" : 총점 : "+total+"점, 평균 : " + avg + "점");
		
		
	}
}
