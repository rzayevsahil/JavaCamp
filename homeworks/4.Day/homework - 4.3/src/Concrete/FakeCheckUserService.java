package Concrete;

import Adapters.PersonCheckService;
import Entities.Player;

public class FakeCheckUserService implements PersonCheckService{

	@Override
	public boolean validation(Player player) {
		System.out.println("Hesab�n do�rulanmas� i�in e-devlet sistemine y�nlendiriliyor...");
		
		if(player.getNationalityId().length()==11) {
			System.out.println(player.getName()+" "+player.getSurname()+" - isimli kullan�c� hesab� ba�ar�yla do�ruland�");
			return true;
		}
		else {
			System.out.println("�zg�n�z.Hesab�n�z do�rulanmad�!");
			return false;
		}
		
	}

}
