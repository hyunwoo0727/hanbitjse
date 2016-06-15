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
		/**
		 * 나열    i     ???
		 * 1 =  0 + ?    ?
		 * 2 =  1 + ?    1 
		 * 4 =  2 + ?    2
		 * 7 =  3 + ?    4
		 * 11 = 4 + ?    7
		 * 16 = 5 + ?   11 
		 20항 20번 
		 합계...공차
		 */
		
		int i=0,diff=1,sum=0;
		// 0~19 i
		// diff 1 2 3 4 5 6 7 8 9 10 ..
		// 숫자 1 2 4 7 11 16 22 
		for (; i < 20; i++){
			diff += i;
			System.out.printf("%d ",diff);
			sum += diff;
		}
		
		System.out.println(sum);
		
	}
}
