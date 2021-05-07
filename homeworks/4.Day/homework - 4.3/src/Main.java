import Concrete.CampaignManager;
import Concrete.FakeCheckUserService;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Game;
import Entities.NewYearCampaign;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		NewYearCampaign campaign=new NewYearCampaign();
		NewYearCampaign campaign1=new NewYearCampaign(1,"Bayram",25);
		Player player=new Player(1,"Engin","Demiroð","11122233344","1985");
		//Game game=new Game(1,"Amoung us","Eðlence",200,campaign);
		Game game=new Game(1,"Amoung us","Eðlence",200);
		
		PlayerManager playerManager=new PlayerManager(new FakeCheckUserService());
		//playerManager.add(player);
		//playerManager.update(player);
		//playerManager.delete(player);
		
		GameManager gameManger=new GameManager();
		//gameManger.add(game);
		//gameManger.update(game);
		//gameManger.delete(game);
		
		SaleManager saleManager=new SaleManager();
		//saleManager.saleGame(player, game);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
	}

}
