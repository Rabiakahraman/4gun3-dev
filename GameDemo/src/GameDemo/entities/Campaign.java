package GameDemo.entities;

import java.time.LocalDate;

public class Campaign {
	
	private int campaignId;
	private String campaignName;
	private double discountRate;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Campaign(int campaignId, String campaignName, double discountRate, LocalDate startDate, LocalDate endDate) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

}
