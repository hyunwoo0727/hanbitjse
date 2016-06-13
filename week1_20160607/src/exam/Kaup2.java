/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : HyunWoo Lee
 * @file   : Kaup2.java 
 * @story  : pattern 
*/
public class Kaup2 {
	
	public static void main(String[] args) {
		//----- init ----
				Scanner scanner = new Scanner(System.in);
				String name="",result="";
				double height=0.0,weight=0.0,kaup=0.0;
				//---- op -----
				System.out.println("이름?");
				name = scanner.next();
				System.out.println("키?");
				height = scanner.nextDouble();
				System.out.println("몸무게?");
				weight = scanner.nextDouble();
				kaup = weight / (height / 100) / (height / 100);
				
				if (kaup < 18.5) {
					result = "저체중";
				}else if(kaup < 22.9 && kaup > 18.5){
					result = "정상";
				}else if(kaup < 24.9 && kaup > 23.0){
					result = "위험체중";
				}else if(kaup < 29.9 && kaup > 25.0){
					result = "비만1단계";
				}else if(kaup < 40 && kaup > 30.0){
					result = "비만2단계";
				}else if(kaup >= 40){
					result = "비만3단계";
				}
/*				System.out.println(name+"은 BMI지수는 "
				+Double.parseDouble(String.format("%.2f", kaup))+"이고,"
						+ " "+result+"이다"); 
*/				
				
				System.out.printf("%s님의 BMI지수는 %.2f이고 %s 입니다",name,kaup,result);
				
	}
	
}
