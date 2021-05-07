package Concrete;

import Abstract.PlayerService;
import Adapters.PersonCheckService;
import Entities.Player;

public class PlayerManager implements PlayerService {

	PersonCheckService eDevlet;
	public PlayerManager(PersonCheckService personCheckService) {
		this.eDevlet=personCheckService;
	}
	
	@Override
	public void add(Player player)  {
		if(eDevlet.validation(player))
		System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullanýcý eklendi\n");
		
		
		
	}

	@Override
	public void update(Player player) {
		if(eDevlet.validation(player))
		System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullanýcý güncellendi\n");

	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullanýcý silindi\n");

	}

}
