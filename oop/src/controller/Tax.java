/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : getTax.java 
 * @story  : 
*/
public class Tax {
	protected double taxRate= 0.097;
	
	public int getTax(int salary){
		
		return (int) (salary * taxRate);
	}
	
}
