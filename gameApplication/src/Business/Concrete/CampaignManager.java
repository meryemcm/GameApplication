package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println('"' + campaign.getName() + '"' + " Adl� Kampanya" + " %" +campaign.getDiscountRate()
		+ " �ndirim Oran�yla Sisteme Ba�ar�yla Eklendi." );	
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("'" + campaign.getName() + "'" + " Adl� Kampanya" + " %" +campaign.getDiscountRate()
		+ " �ndirim Oran�yla Ba�ar�yla G�ncellendi." );	
		
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println("'" + campaign.getName() + "'" + " Adl� Kampanya" + " Sistemden Ba�ar�yla Silindi." );
		
	}

}
