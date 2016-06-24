package collection;

import java.util.List;
import java.util.Vector;

import school.StudentBean;

public class VectorEx {
//	Vector<StudentBean> v = new Vector<StudentBean>();
	public static void main(String[] args) {
		List<StudentBean> v = new Vector<StudentBean>();
		StudentBean test = null;
		StudentBean searchman = new StudentBean();
		StudentBean hong = new StudentBean("홍길동", "a", "1234", "870727-1");
		StudentBean kim = new StudentBean("김유신", "b", "3333", "900727-1");
		StudentBean park = new StudentBean("이순신", "c", "3333", "880727-2");
		v.add(hong);
		v.add(kim);
		v.add(park);
//		System.out.println("size : " + v.toString());
		
		String searchName = "333";
		for (int i = 0; i < v.size(); i++) {
			if(v.get(i).getName().equals(searchName)){
				searchman = v.get(i);
			}
		}
		if(searchman.getId() != null){
			System.out.println(searchman.toString());
		}else{
			System.out.println(searchName+"(이)라는 이름은 없습니다");
		}
		
	}
}
