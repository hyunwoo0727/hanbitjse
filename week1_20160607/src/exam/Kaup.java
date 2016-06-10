/**
 * 
 */
package exam;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : HyunWoo Lee
 * @file   : Kaup.java 
 * @story  : 카우푸지수 구하는 프로그램 
*/
public class Kaup {	
	/**
	 * 개발자님 프로그램 제작의뢰임다.
	 * 비만지수를 구하는 것인데여
	 * 키와 몸무게를 입력하면 당사자가
	 * 비만인지 저체중인지 알려주는
	 * 프로그램을 만들어주셈
	 * 돈은 입금했음. 
	 * 잘은 모르는데 kaup 공식을 쓰면 
	 * 된다고 함 공식은 나도 모름 
	 * 알아서 하삼.
	 * */
	
	public static void main(String[] args) {
		// 체중 (kg)÷키²(㎡)
	/*	BMI 수치 계산법 : 체중 / 신장(㎡) / 신장(㎡)
		
		*/
		
		double height=0.0,weight=0.0,bmi=0.0;
		String result="";
		Scanner scan = new Scanner(System.in);
		
//		------------------------------------------
		System.out.print("키(cm)를 입력하세요 : ");
		height = scan.nextDouble();
		checkRange(height);
		System.out.print("몸무게(kg)를 입력하세요 : ");
		weight = scan.nextDouble();
		checkRange(weight);
		height /= 100;
//		bmi = weight / (height*height); 
		bmi = weight / height / height;
		
		if(bmi >= 40){
			result = "비만 3단계";
		}else if(bmi<40 && bmi >=30){
			result = "비만 2단계";
		}else if(bmi<30 && bmi >=25){
			result = "비만 1단계";
		}else if(bmi<25 && bmi >=23){
			result = "위험 체중";
		}else if(bmi<23 && bmi >=18.5){
			result = "정상 체중";
		}else{
			result = "저체중";
		}
//		bmi = Double.parseDouble(new DecimalFormat("0.00").format(bmi));
		
//		------------------------------------------		
//		System.out.println("bmi 수치 : "+ bmi +" 결과 : " + result + " 입니다");
		System.out.printf("bmi 수치 : %.2f 결과 :  %s 입니다",bmi,result);
//		System.out.println(result + " 입니다");
	}
	
	
	public static void checkRange(double num){
		
		if(num < 0){
			System.out.println("음수는 입력 불가합니다");
			System.exit(0);
		}
		
	}

}
