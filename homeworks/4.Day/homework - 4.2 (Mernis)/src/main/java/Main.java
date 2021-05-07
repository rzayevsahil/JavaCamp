import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;


public class Main {

	public static void main(String[] args) throws MalformedURLException {

		String endpoint="https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";

		URL url=URI.create(endpoint).toURL();
		KPSPublic service =new KPSPublic(url);
		KPSPublicSoap port=(KPSPublicSoap) service.getPort(KPSPublicSoap.class);
		//port.tcKimlikNoDogrula(tc,isim hepsi büyük,soyisim hepsi büyük,int tipinde yýl);
	}

}
