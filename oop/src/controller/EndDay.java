/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : EndDay.java 
 * @story  : 
*/
public class EndDay {
	public int getEndDay(int year,int month){
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			return 31;
		case 2:
			return (year%4==0 && year%100!=0) || year%400==0  ? 29:28;
		case 4:case 6:case 9:case 11:
			return 30;
		default:
			return -1;
		}
	}
}
