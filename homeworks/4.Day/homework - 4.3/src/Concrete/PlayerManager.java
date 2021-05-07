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
		System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullan�c� eklendi\n");
		
		
		
	}

	@Override
	public void update(Player player) {
		if(eDevlet.validation(player))
		System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullan�c� g�ncellendi\n");

	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullan�c� silindi\n");

	}

}
