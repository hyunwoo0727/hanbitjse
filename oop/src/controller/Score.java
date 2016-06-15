/**
 * 
 */
package controller;


/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : GetScore.java 
 * @story  : 
*/
public class Score {
	int i=0;
	public int getMax(int[] arrScore){
		int max = 0;
		for (i=0; i < arrScore.length; i++) {
			if(arrScore[i] >= max){
				max = arrScore[i];
			}
		}
		return max;
	}
	public int getMin(int[] arrScore){
		int min=100;
		
		for (i=0; i < arrScore.length; i++) {
			if(arrScore[i] <= min){
				min = arrScore[i];
			}
		}
		return min;
	}
}



