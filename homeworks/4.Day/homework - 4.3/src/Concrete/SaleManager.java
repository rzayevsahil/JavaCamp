package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleService {

	@Override
	public void saleGame(Player player, Game game) {
		double eskiFiyat = game.getPrice();
		if(game.getCampaign()==null) {
			System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullan�c� '" + game.getName()
			+ "' oyunu "+ game.getPrice() + " tl de�erinde ba�ar�yla sat�n ald�");
		}else {
			
			double discountedPrice = game.getPrice() - game.getPrice() * game.getCampaign().getDiscount() / 100;
			game.setPrice(discountedPrice);
			System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullan�c� '" + game.getName()
			+ "' oyunu "+ game.getPrice() + " tl de�erinde indirimle sat�n ald� (eski fiyat : " + eskiFiyat + " tl)");
		}
		
		
		
		/*System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullan�c� '" + campaign.getName()
		+ "' indirimi kullanarak '" + game.getName() + "' oyunu " + game.getPrice()
		+ " tl de�erinde ba�ar�yla sat�n ald�(eski fiyat:" + game.getPrice() + ")");*/

	}

	
	

}
