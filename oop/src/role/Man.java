package role;

public class Man implements Human{
	@Override
	public void role() {
		System.out.println("남자의 역할");
	}

	@Override
	public void worry() {
		System.out.println("남자의 고민");
	}
}
