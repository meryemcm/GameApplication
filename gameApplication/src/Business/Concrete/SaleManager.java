package Business.Concrete;

import Business.Abstract.SaleService;
import Entities.Campaign;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sale) {
		System.out.println("Say�n" + " " + sale.getGamer().getFirstNameString() + " " + 
	    sale.getGamer().getLastName() + " " +  '"' + sale.getGame().getGameName() + '"'  + " " + "Adl� Oyunu" + " " +
		sale.getGame().getPrice() + "TL Kar��l���nda Sat�n Ald�n�z.");
		
	}
	public void add(Sale sale, Campaign campaign) {
		
		System.out.println("Say�n" + " " + sale.getGamer().getFirstNameString() + " " +
				sale.getGamer().getLastName() + " " + '"' + sale.getGame().getGameName() + '"' + " " + "Adl� Oyunu" + " " + '"' + campaign.getName() + '"' + " " 
				+ "�le" + " " + "%" + campaign.getDiscountRate() + " " + "�ndirimli Olarak" 
		+ " " + (sale.getGame().getPrice()-(sale.getGame().getPrice()*campaign.getDiscountRate()/100)) + "TL Kar��l���nda Sat�n Ald�n�z." + "\n" 
				+ "*Bu �ndirimden Kazanc�n�z:" + " " + sale.getGame().getPrice()*campaign.getDiscountRate()/100 + "TL");
		
	}



}
