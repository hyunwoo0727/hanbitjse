/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : HyunWoo Lee
 * @file   : Avg.java 
 * @story  : 
*/
public class Avg2 {
	
	public static void main(String[] args) {
		
//		 선언부,초기화 작업(initialize)
//		90이상 a ..args.. 50점 미만 F
		
		int kuk=0,eng=0,math=0,total=0,avg=0;
		String name="",result="";
		Scanner scanner = new Scanner(System.in);
		
		//연산부 (operation,algorithm)------------------------------
		System.out.print("이름 : ");
		name = scanner.nextLine();
		
		System.out.print("국어 점수 : ");
		kuk = scanner.nextInt();
		if(kuk > 100 || kuk < 0){
			System.out.println("점수는 0~100 사이만 입력 가능합니다.");
			return;
		}
		
		System.out.print("영어 점수 : ");
		eng = scanner.nextInt();
		if(eng > 100 || eng < 0){
			System.out.println("점수는 0~100 사이만 입력 가능합니다.");
			return;
		}
		
		System.out.print("수학 점수 : ");
		math = scanner.nextInt();
		if(math > 100 || math < 0){
			System.out.println("점수는 0~100 사이만 입력 가능합니다.");
			return;
		}
		total = kuk+eng+math;
		avg = total/3;
		
		if (avg>=90) {
			result="A";
		}else if(avg<90 && avg>=80){
			result="B";
		}else if(avg<80 && avg>=70){
			result="C";
		}else if(avg<70 && avg>=60){
			result="D";
		}else {
			result="F";
		}
		//------출력부(console)-------------------------
		System.out.println(name+" : 총점 : "+total+"점, 평균 : " + avg + "점,"
				+ " 학점( " + result +" ) 입니다.");
	}
	
	
}
