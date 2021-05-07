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
			System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullanýcý '" + game.getName()
			+ "' oyunu "+ game.getPrice() + " tl deðerinde baþarýyla satýn aldý");
		}else {
			
			double discountedPrice = game.getPrice() - game.getPrice() * game.getCampaign().getDiscount() / 100;
			game.setPrice(discountedPrice);
			System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullanýcý '" + game.getName()
			+ "' oyunu "+ game.getPrice() + " tl deðerinde indirimle satýn aldý (eski fiyat : " + eskiFiyat + " tl)");
		}
		
		
		
		/*System.out.println(player.getName() + " " + player.getSurname() + " - isimli kullanýcý '" + campaign.getName()
		+ "' indirimi kullanarak '" + game.getName() + "' oyunu " + game.getPrice()
		+ " tl deðerinde baþarýyla satýn aldý(eski fiyat:" + game.getPrice() + ")");*/

	}

	
	

}
