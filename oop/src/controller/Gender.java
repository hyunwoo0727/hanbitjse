/**
 * 
 */
package controller;


/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : getGender.java 
 * @story  : 
*/
public class Gender {
	
	
	char genCode=' ';
	
	public String getGender(String sCode){
		
		genCode = sCode.charAt(sCode.length()-1);
		
		if(genCode=='0' || genCode=='9'){
			return "잘못된 주민등록번호 입니다";
		}		
		if(genCode%2 != 0){
			return "남자";
		}
		return "여자";
	}
	
	
	
}
