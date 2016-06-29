package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date   :2016. 6. 28.
 * @author :HyunWoo Lee
 * @file   :MemberServiceImpl.java
 * @story  :
*/

public class MemberServiceImpl implements MemberService{
	private Map<String, MemberBean> map;
	private MemberBean session;
	
	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
	}
	@Override
	public String join(MemberBean mBean) {
		if(map.containsKey(mBean.getId())){
			return "아이디가 이미 있습니다";
		}
		this.map.put(mBean.getId(), mBean);
		return mBean.getId()+" 님 가입완료!";
	}
	@Override
	public String login(MemberBean mBean) {
		if(map.containsKey(mBean.getId())){
			if(this.map.get(mBean.getId()).getPw().equals(mBean.getPw())){	
				session = map.get(mBean.getId());
				return session.getId() + "님 환영합니다"; 
			}
			return "비밀번호를 확인하세요";
		}
		return "아이디가 없습니다";
	}
	@Override
	public MemberBean detail() {
		// TODO Auto-generated method stub
		return this.session;
	}
	@Override
	public List<MemberBean> list() {
		List<MemberBean> list = new ArrayList<MemberBean>();
		for (Map.Entry<String, MemberBean> entry : map.entrySet()) {
			list.add(entry.getValue());
		}
		return list; 
	}
	@Override
	public MemberBean findById(String id) {
		return map.containsKey(id) ? map.get(id) : null;
	}
	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> tempList = new ArrayList<MemberBean>();
		for (Map.Entry<String, MemberBean> entry : map.entrySet()) {
			if(entry.getValue().getName().equals(name)){
				tempList.add(entry.getValue());
			}
		}
		return tempList;
	}
	@Override
	public String updatePw(MemberBean mBean) {
		if(map.containsKey(mBean.getId())){
			map.get(mBean.getId()).setPw(mBean.getPw());           
			return "변경완료";
		}
		return "아이디가 없습니다";
	}
	@Override
	public String delete() {
		map.remove(session.getId());
		session = null;
		return "탈퇴 완료";
	}
	@Override
	public int count() {
		return this.map.size();
	}
	@Override
	public List<MemberBean> findByGender(String gender) {
		List<MemberBean> tempList = new ArrayList<MemberBean>();
		for (Map.Entry<String, MemberBean> entry : map.entrySet()) {
			if(entry.getValue().getName().equals(gender)){
				tempList.add(entry.getValue());
			}
		}
		return tempList;
	}
	@Override
	public int GenderCount(String gender) {
		// TODO Auto-generated method stub
		int count = 0;
		for (Map.Entry<String, MemberBean> entry : map.entrySet()) {
			if(entry.getValue().getGender().equals(gender)){
				count++;
			}
		}
		return count;
	}
}
