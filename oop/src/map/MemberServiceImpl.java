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
	private Map<String, MemberBean> map;
	
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
			return this.map.get(mBean.getId()).getPw().equals(mBean.getPw()) ? mBean.getId() + "님 환영합니다" : "로그인 실패";
		}
		return "아이디가 없습니다";
	}
	@Override
	public MemberBean detail(String id) {
		// TODO Auto-generated method stub
		return this.map.get(id);
	}
	@Override
	public Map<String, MemberBean> list() {
		return this.map;
	}
	@Override
	public MemberBean findById(String id) {
		return map.containsKey(id) ? map.get(id) : null;
	}
	@Override
	public Map<String, MemberBean> findByName(String name) {
		Map<String, MemberBean> tempMap = new HashMap<String,MemberBean>();
		MemberBean tempBean = null;
		Iterator<MemberBean> it = map.values().iterator();
		while(it.hasNext()){
			tempBean = it.next();
			if(tempBean.getName().equals(name)){
				tempMap.put(tempBean.getId(), tempBean);
			}
		}
		return tempMap;
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
	public String delete(String id) {
		if(map.containsKey(id)){
			map.remove(id);
			return "탈퇴완료";
		}
		return "아이디가 없습니다";
	}
	@Override
	public int count() {
		return this.map.size();
	}
	@Override
	public Map<String, MemberBean> findByGender(String gender) {
		Map<String, MemberBean> tempMap = new HashMap<String,MemberBean>();
		MemberBean tempBean = null;
		Iterator<MemberBean> it = map.values().iterator();
		while(it.hasNext()){
			tempBean = it.next();
			if(tempBean.getGender().equals(gender)){
				tempMap.put(tempBean.getId(), tempBean);
			}
		}
		return tempMap;
	}
}
