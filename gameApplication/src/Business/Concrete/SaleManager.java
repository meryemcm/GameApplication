package Business.Concrete;

import Business.Abstract.SaleService;
import Entities.Campaign;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sale) {
		System.out.println("Sayýn" + " " + sale.getGamer().getFirstNameString() + " " + 
	    sale.getGamer().getLastName() + " " +  '"' + sale.getGame().getGameName() + '"'  + " " + "Adlý Oyunu" + " " +
		sale.getGame().getPrice() + "TL Karþýlýðýnda Satýn Aldýnýz.");
		
	}
	public void add(Sale sale, Campaign campaign) {
		
		System.out.println("Sayýn" + " " + sale.getGamer().getFirstNameString() + " " +
				sale.getGamer().getLastName() + " " + '"' + sale.getGame().getGameName() + '"' + " " + "Adlý Oyunu" + " " + '"' + campaign.getName() + '"' + " " 
				+ "Ýle" + " " + "%" + campaign.getDiscountRate() + " " + "Ýndirimli Olarak" 
		+ " " + (sale.getGame().getPrice()-(sale.getGame().getPrice()*campaign.getDiscountRate()/100)) + "TL Karþýlýðýnda Satýn Aldýnýz." + "\n" 
				+ "*Bu Ýndirimden Kazancýnýz:" + " " + sale.getGame().getPrice()*campaign.getDiscountRate()/100 + "TL");
		
	}



}
