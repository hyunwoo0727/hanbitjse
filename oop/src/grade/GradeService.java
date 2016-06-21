package grade;

public interface GradeService {
	public String getGrade(int avg);
	public int getTotal();
	public int getAvg(int cnt);
	public void registStudent(String[] stuSpec);
	public String getResult(int total,int avg,String result);
}
