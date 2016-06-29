package map;


/**
 * @date   :2016. 6. 29.
 * @author :HyunWoo Lee
 * @file   :Test.java
 * @story  :
*/

public class Test {
	public static void main(String[] args) {
		String name1 = "∑∀㎯λη";
		String name2 = "∑∀㎯λη";
		
		if(name1 == name2){
			System.out.println("name1==name2");
		}else{
			System.out.println("name1==name2");			
		}
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		if(name3 == name4){
			System.out.println("name3==name4");
		}else{
			System.out.println("name3!=name4");			
		}
		
		int b = 0,c=0;
		for (int i =0; i < 1115500; i++) {
			b = i + 1;
			c = i + b + 1;
			System.out.println(i+" "+b+" "+c);
		}
	}
}
