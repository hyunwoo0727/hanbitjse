package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @date   :2016. 6. 28.
 * @author :HyunWoo Lee
 * @file   :MemberServiceImpl.java
 * @story  :
*/

public class MemberServiceImpl implements MemberService{
	private Map<String, MemberBean> list;
	
	public MemberServiceImpl() {
		list = new HashMap<String, MemberBean>();
	}
	@Override
	public String join(MemberBean mBean) {
		if(list.containsKey(mBean.getId())){
			return "아이디가 이미 있습니다";
		}
		this.list.put(mBean.getId(), mBean);
		return mBean.getId()+" 님 가입완료!";
	}
	@Override
	public String login(MemberBean mBean) {
		// TODO Auto-generated method stub
		return this.list.get(mBean.getId()).getPw().equals(mBean.getPw()) ? mBean.getId() + "님 환영합니다" : "로그인 실패";
	}
	@Override
	public MemberBean detail(String id) {
		// TODO Auto-generated method stub
		return this.list.get(id);
	}
	@Override
	public Map<String, MemberBean> list() {
		return this.list;
	}
	@Override
	public MemberBean findById(String id) {
		return list.containsKey(id) ? list.get(id) : null;
	}
	@Override
	public Map<String, MemberBean> findByName(String name) {
		Map<String, MemberBean> tempList = new HashMap<String,MemberBean>();
		MemberBean tempBean = null;
		Iterator<MemberBean> it = list.values().iterator();
		while(it.hasNext()){
			tempBean = it.next();
			if(tempBean.getName().equals(name)){
				tempList.put(tempBean.getId(), tempBean);
			}
		}
		return tempList;
	}
	@Override
	public String updatePw(MemberBean mBean) {
		if(list.containsKey(mBean.getId())){
			list.get(mBean.getId()).setPw(mBean.getPw());           
			return "변경완료";
		}
		return "아이디가 없습니다";
	}
	@Override
	public String delete(String id) {
		if(list.containsKey(id)){
			list.remove(id);
			return "탈퇴완료";
		}
		return "아이디가 없습니다";
	}
	@Override
	public int count() {
		return this.list.size();
	}
	@Override
	public Map<String, MemberBean> findByGender(String gender) {
		Map<String, MemberBean> tempList = new HashMap<String,MemberBean>();
		MemberBean tempBean = null;
		Iterator<MemberBean> it = list.values().iterator();
		while(it.hasNext()){
			tempBean = it.next();
			if(tempBean.getGender().equals(gender)){
				tempList.put(tempBean.getId(), tempBean);
			}
		}
		return tempList;
	}
}
