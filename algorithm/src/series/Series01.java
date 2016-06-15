/**
 * 
 */
package series;

/**
 * @date   : 2016. 6. 15.
 * @author : HyunWoo Lee
 * @file   : Series01.java 
 * @story  : 
*/
public class Series01 {
	/**
	 * 1+2+4+7+11+16+...의 순서로 
	 * 나열되는 수열의 
	 * 20번째 항까지의 합계
	 * */
	
	public static void main(String[] args) {
		int i=0,diff=1,sum=0;
		
		for (; i < 20; i++){
			diff = diff + i;
			System.out.printf("%d ",diff);
			sum = sum + diff;
		}
		
		System.out.println(sum);
		
	}
}
