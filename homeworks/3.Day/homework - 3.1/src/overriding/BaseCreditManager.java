package overriding;

public class BaseCreditManager {
	public double hesapla(double tutar) { 
		//public final double hesapla(double tutar) --> final keyword'� ekledi�imizde biz bu metodu inherit etti�imiz classlarda ezemiyoruz(override edemiyoruz k�saca)
		return tutar * 1.18;
	}
}
