package Entities;

public class Campaign {

	private int id;
	private String campaignName;
	private String campaignDescription;
	private String campaignDuration;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignDescription() {
		return campaignDescription;
	}
	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}
	public String getCampaignDuration() {
		return campaignDuration;
	}
	public void setCampaignDuration(String campaignDuration) {
		this.campaignDuration = campaignDuration;
	}
}
