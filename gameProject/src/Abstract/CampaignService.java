package Abstract;

import Entities.Campaign;

public interface CampaignService {

	void addCampain(Campaign campaign);
	
    void deleteCampain(Campaign campaign);
    
    void updateCampain(Campaign campaign);
}
