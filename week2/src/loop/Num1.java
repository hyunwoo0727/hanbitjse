/**
 * 
 */
package loop;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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
	
		
		LinkedHashMap<String, Integer> lhmStudent = new LinkedHashMap<>();
		
		//-----------operation------------------//
		
		for (int i = 0; i < 5; i++) {
			System.out.print("이름을 입력하세요 : ");
			sTemp = scan.next();
			System.out.print("점수를 입력하세요 : ");
			iTemp = scan.nextInt();
			if(iTemp > 100){
				System.out.println("다시 입력해!");
				i--;
			}	
			lhmStudent.put(sTemp, iTemp);
		}
		
		
		List<Integer> list = new ArrayList<Integer>(lhmStudent.values());
		Comparator<Integer> c = Collections.reverseOrder();
		Collections.sort(list,c);
		
		//-----------console----------------//
		System.out.println("--------------------------------");
		
		System.out.println("--------------------------------");

		
	}
	
	
}
	