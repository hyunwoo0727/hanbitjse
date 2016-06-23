package collection;

import java.util.HashSet;
import java.util.Set;
import school.StudentBean;

public class HashSetEx {
	public static void main(String[] args) {
		Set<StudentBean> stu = new HashSet<StudentBean>();
		StudentBean hong = new StudentBean("홍", "a", "1234", "870727-1");
		StudentBean kim = new StudentBean("김", "b", "3333", "900727-1");
		StudentBean park = new StudentBean("박", "c", "3333", "880727-2");
		stu.add(hong);
		stu.add(kim);
		stu.add(park);
	}
}
