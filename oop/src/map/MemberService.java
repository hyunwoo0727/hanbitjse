package map;

import java.util.List;
import java.util.Map;

/**
 * @date   :2016. 6. 28.
 * @author :HyunWoo Lee
 * @file   :MemberService.java
 * @story  :
*/

public interface MemberService {
	public String join(MemberBean mBean);
	public String login(MemberBean mBean);
	public MemberBean detail();
	public List<MemberBean> list();
	public MemberBean findById(String id);
	public List<MemberBean> findByName(String name);
	public List<MemberBean> findByGender(String gender);
	public int GenderCount(String gender);
	public String updatePw(MemberBean mBean);
	public String delete();
	public int count();
	
}
