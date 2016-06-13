/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 13.
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
		//-----------initializing------------------//
		Scanner scan = new Scanner(System.in);
		int iTemp=0;
		String sTemp="";
		String[] arrName = new String[3];
		int[] score =  new int[3];
	
		
		//-----------operation------------------//
	
		
		for (int i = 0; i < arrName.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			arrName[i] = scan.next();
			System.out.print("점수를 입력하세요 : ");
			score[i] = scan.nextInt();
			if(score[i] > 100){
				System.out.println("다시 입력해!");
				i--;
			}		
		}
		
		for (int i = 0; i < arrName.length-1; i++) {
			for (int j = 0; j < score.length-i-1; j++) {
				if(score[j] < score[j+1]){
					iTemp = score[j];
					score[j] = score[j+1];
					score[j+1] = iTemp;
					sTemp = arrName[j];
					arrName[j] = arrName[j+1];
					arrName[j+1] = sTemp;
				}
			}
		}
		
		iTemp = 1;
		//-----------console----------------//
		
		for (String string : arrName) {
			System.out.println(iTemp++ +"등 : " + string);
		}
		
		/*for (int i : score) {
			System.out.println(i);
		}*/
		
	}
	
	
}
	