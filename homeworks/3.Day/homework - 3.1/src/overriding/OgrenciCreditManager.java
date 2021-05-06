package overriding;

public class OgrenciCreditManager extends BaseCreditManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
