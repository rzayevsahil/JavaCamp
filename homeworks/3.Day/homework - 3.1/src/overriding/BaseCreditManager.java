package overriding;

public class BaseCreditManager {
	public double hesapla(double tutar) { 
		//public final double hesapla(double tutar) --> final keyword'ü eklediðimizde biz bu metodu inherit ettiðimiz classlarda ezemiyoruz(override edemiyoruz kýsaca)
		return tutar * 1.18;
	}
}
