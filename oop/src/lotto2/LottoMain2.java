package lotto2;

public class LottoMain2 {
	public static void main(String[] args) {
		LottoBallService service = new LottoBallServiceImpl();
		
		service.setLottoball();
		
		System.out.print("당첨 번호 : ");
		for (int num : service.getLottoball()) {
			System.out.print(num + " ");
		}
	
	}
}
