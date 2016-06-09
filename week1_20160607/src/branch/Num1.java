/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 9.
 * @author : HyunWoo Lee
 * @file   : Num1.java 
 * @story  : 
*/
public class Num1 {
	/**
	 * 저희반학생수는 3명임다
	 * 학생의 평균 점수는 0~100 점사이임다
	 * 3명의 평균점수를 입력하면
	 * 1등 xxx
	 * 2등 xxx
	 * 3등 xxx 
	 * 이렇게 나오도록 해주세용 
	 * 단 학생이름은 스캐너로 입력받습니다.
	 * 동점은 없엉...
	 * */
	
	
	public static void main(String[] args) {
		
		String sName1="",sName2="",sName3="",rank1="",rank2="",rank3="";
		int avg1=0,avg2=0,avg3=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 학생 이름을 입력하세요 : ");
		sName1 = scan.next();
		System.out.print("점수를 입력하세요(0~100점) : ");
		avg1 = scan.nextInt();
		if(avg1 > 100 || avg1 < 0){
			System.out.println("점수는 0에서 100점 사이만 입력 가능합니다");
			return;
		}
		
		System.out.print("두 번째 학생 이름을 입력하세요 : ");
		sName2 = scan.next();
		System.out.print("점수를 입력하세요(0~100점) : ");
		avg2 = scan.nextInt();
		if(avg2 > 100 || avg2 < 0){
			System.out.println("점수는 0에서 100점 사이만 입력 가능합니다");
			return;
		}
		
		System.out.print("세 번째 학생 이름을 입력하세요 : ");
		sName3 = scan.next();
		System.out.print("점수를 입력하세요(0~100점) : ");
		avg3 = scan.nextInt();
		if(avg3 > 100 || avg3 < 0){
			System.out.println("점수는 0에서 100점 사이만 입력 가능합니다");
			return;
		}
		
		if(avg1>avg2 && avg1>avg3){
			if(avg2>avg3){
				rank1 = sName1;
				rank2 = sName2;
				rank3 = sName3;
			}else{
				rank1 = sName1;
				rank2 = sName3;
				rank3 = sName2;
			}	
		}
		if(avg2>avg1 && avg2>avg3){
			if(avg1>avg3){
				rank1 = sName2;
				rank2 = sName1;
				rank3 = sName3;
			}else{
				rank1 = sName2;
				rank2 = sName3;
				rank3 = sName1;
			}
		}
		if(avg3>avg1 && avg3>avg2){
			if(avg1>avg2){
				rank1 = sName3;
				rank2 = sName1;
				rank3 = sName2;
			}else{
				rank1 = sName3;
				rank2 = sName2;
				rank3 = sName1;
			}
			
		}
		
		System.out.println("----------결과-----------");
		System.out.println("1등 : " + rank1);
		System.out.println("2등 : " + rank2);
		System.out.println("3등 : " + rank3);
		
		
		
		
		
	}

}
