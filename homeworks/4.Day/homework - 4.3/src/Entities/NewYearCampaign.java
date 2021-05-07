package Entities;

public class NewYearCampaign extends Campaign {

	public NewYearCampaign() {
		super.setDiscount(50);
	}

	public NewYearCampaign(int id, String name, int discount) {
		super(id, name, discount);
	}
}
