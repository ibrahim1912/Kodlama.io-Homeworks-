package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampain(Campaign campaign) {
		System.out.println("Kampanya eklendi" + campaign.getCampaignName()); //simülasyon
		
	}

	@Override
	public void deleteCampain(Campaign campaign) {
		System.out.println("Kampanya silindi" + campaign.getCampaignName());
		
	}

	@Override
	public void updateCampain(Campaign campaign) {
		System.out.println("Kampanya güncellendi" + campaign.getCampaignName());
		
	}

}
