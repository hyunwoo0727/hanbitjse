package grade;

public class GradeServiceImpl implements GradeService{
	GradeBean gradeBean;
	
	@Override
	public String getGrade(int avg) {
		switch (avg/10) {
		case 10: case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}
	@Override
	public int getTotal() {
		return gradeBean.getKuk() + gradeBean.getEng() + gradeBean.getMath();
	}
	@Override
	public int getAvg(int cnt) {
		return getTotal()/cnt;
	}
	@Override
	public String getResult(int total,int avg,String result) {
		// TODO Auto-generated method stub
		return gradeBean.toString() + " 총점 : " + total + " 평균 : " + avg + " 결과 : " + result;
	}

	@Override
	public void registStudent(String[] stuSpec) {
		gradeBean = new GradeBean(stuSpec[0]);
		gradeBean.setKuk(Integer.parseInt(stuSpec[1]));
		gradeBean.setEng(Integer.parseInt(stuSpec[2]));
		gradeBean.setMath(Integer.parseInt(stuSpec[3]));
	}
	
	
	
}
