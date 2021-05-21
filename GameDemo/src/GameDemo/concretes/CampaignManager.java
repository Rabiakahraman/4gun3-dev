package GameDemo.concretes;

import GameDemo.abstracts.ICampaignService;
import GameDemo.entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void start(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ "kampanya baþlatýldý");
		
		
	}

	@Override
	public void end(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya sonlandýrýldý");
		
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya güncellendi");
		
		
	}

}
