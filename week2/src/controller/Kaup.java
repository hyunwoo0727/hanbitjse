/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : Kaup.java 
 * @story  : 
*/
public class Kaup {
	public String getKaup(String name,double height,double weight){
		String result="";
		double kaup = weight / (height / 100) / (height / 100);
		
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
		
		return "카우푸 지수 : " + String.format("%.2f", kaup) + " 이고 " +result + " 입니다";
	}
}
