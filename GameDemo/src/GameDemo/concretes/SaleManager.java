package GameDemo.concretes;

import java.time.LocalDate;

import GameDemo.abstracts.ICampaignService;
import GameDemo.abstracts.ISaleService;
import GameDemo.entities.Campaign;
import GameDemo.entities.Game;
import GameDemo.entities.Gamer;

public class SaleManager implements ISaleService {
	
	ICampaignService campaignService;
	
public SaleManager() {
		
	}
	public SaleManager(ICampaignService campaignService) {
		
		this.campaignService = campaignService;
	}
	

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+game.getGameName()+" oyununu satýn aldý "
				+ "\n Oyun fiyatý: " +game.getPrice());
		
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
double reducedPrice = game.getPrice() * ((100-campaign.getDiscountRate())/100);
		
		LocalDate start = campaign.getStartDate();
		LocalDate end = campaign.getEndDate();
		LocalDate today = LocalDate.now();
		
		if (start.getDayOfMonth() <= today.getDayOfMonth() && today.getDayOfMonth() <= end.getDayOfMonth()) {
			
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" " +game.getGameName()+" oyununu "+ campaign.getCampaignName()+
				" kampanyasý ile satýn aldý \n"
				+ "Oyun fiyatý: " + reducedPrice );
			
	
		}else {
			System.out.println("Bu kampanya sona ermiþtir. Oyunu normal fiyatý üzerinden satýn alabilirsiniz.");
		}
		
	}
	

}
