package gameRps;

public interface RpsService {
	public void betPlayValue(int playValue);
	public void setCompValue();
	public void whoWin();
	public String showResult();
	public boolean validation(String rps);
}
