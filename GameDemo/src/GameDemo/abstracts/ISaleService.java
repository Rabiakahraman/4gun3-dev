package GameDemo.abstracts;

import GameDemo.entities.Campaign;
import GameDemo.entities.Game;
import GameDemo.entities.Gamer;

public interface ISaleService {
	
	void sale(Game game, Gamer gamer);
	void saleWithCampaign(Game game,Gamer gamer, Campaign campaign);
	

}
