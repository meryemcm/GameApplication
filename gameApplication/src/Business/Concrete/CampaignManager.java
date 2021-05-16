package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println('"' + campaign.getName() + '"' + " Adlý Kampanya" + " %" +campaign.getDiscountRate()
		+ " Ýndirim Oranýyla Sisteme Baþarýyla Eklendi." );	
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("'" + campaign.getName() + "'" + " Adlý Kampanya" + " %" +campaign.getDiscountRate()
		+ " Ýndirim Oranýyla Baþarýyla Güncellendi." );	
		
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println("'" + campaign.getName() + "'" + " Adlý Kampanya" + " Sistemden Baþarýyla Silindi." );
		
	}

}
