package Concrete;

import Adapters.PersonCheckService;
import Entities.Player;

public class FakeCheckUserService implements PersonCheckService{

	@Override
	public boolean validation(Player player) {
		System.out.println("Hesabýn doðrulanmasý için e-devlet sistemine yönlendiriliyor...");
		
		if(player.getNationalityId().length()==11) {
			System.out.println(player.getName()+" "+player.getSurname()+" - isimli kullanýcý hesabý baþarýyla doðrulandý");
			return true;
		}
		else {
			System.out.println("Üzgünüz.Hesabýnýz doðrulanmadý!");
			return false;
		}
		
	}

}
