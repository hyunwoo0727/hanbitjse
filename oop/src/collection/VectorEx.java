package collection;

import java.util.List;
import java.util.Vector;

import school.StudentBean;

public class VectorEx {
//	Vector<StudentBean> v = new Vector<StudentBean>();
	public static void main(String[] args) {
		List<StudentBean> v = new Vector<StudentBean>();
		StudentBean hong = new StudentBean("홍", "a", "1234", "870727-1");
		StudentBean kim = new StudentBean("김", "b", "3333", "900727-1");
		StudentBean park = new StudentBean("박", "c", "3333", "880727-2");
		v.add(hong);
		v.add(kim);
		v.add(park);
		System.out.println("::::::::::::::요소추가후:::::::::");
		System.out.println("size : " + v.toString());
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).getName());
		}
	}
}
