/**
 * 
 */
package school;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date   : 2016. 6. 17.
 * @author : HyunWoo Lee
 * @file   : WhatTimeIsItNow.java 
 * @story  : 
*/
public class WhatTimeIsItNow {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println();
		Date date = new Date(time);
		
	}
}
