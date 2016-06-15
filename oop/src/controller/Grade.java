/**
 * 
 */
package controller;


/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : getGrade.java 
 * @story  : 
*/
public class Grade {
	public String[] getGrade(String[] arrName,int[] score){
//		int iTemp=0;
		String sTemp="";
				
		for (int i = 0; i < arrName.length-1; i++) {
			for (int j = 0; j < score.length-i-1; j++) {
				if(score[j] < score[j+1]){
			/*		iTemp = score[j];
					score[j] = score[j+1];
					score[j+1] = iTemp;*/
					sTemp = arrName[j];
					arrName[j] = arrName[j+1];
					arrName[j+1] = sTemp;
				}
			}
		}
		
		return arrName;
	}
}
