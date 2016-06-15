/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : getTime.java 
 * @story  : 
*/
public class Time {
	// System.out.println(sec/3600 +"시간 " + sec/60%60 + "분 " + sec%60 +"초");
	
	public String getTime(int sec){
		
		return sec/3600 +"시간 " + sec/60%60 + "분 " + sec%60 +"초";
		
	}
}
