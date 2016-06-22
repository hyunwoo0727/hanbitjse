package role;

public class Employee extends Man{
	@Override
	public void role() {
		// TODO Auto-generated method stub
		System.out.println("직원의 역할");
	}
	@Override
	public void worry() {
		System.out.println("직원의 고민");
	}
}
