package map;

/**
 * @date   :2016. 6. 28.
 * @author :HyunWoo Lee
 * @file   :MemberBean.java
 * @story  :
*/

public class MemberBean {
	private String id,pw,name,gender;
	
	public MemberBean() {
		// TODO Auto-generated constructor stub
	}
	public MemberBean(String[] inform) {
		this.id = inform[0];
		this.name = inform[1];
		this.pw = inform[2];
		this.gender = inform[3];
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return " [아이디= " + id + ", 이름=" + name + ", 비밀번호=" + pw+ ", 성별=" + gender + "]\n";
	}
	
}
