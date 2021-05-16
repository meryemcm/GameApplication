import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.GamerManager;
import Business.Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstNameString("Hatice Meryem");
		gamer1.setLastName("Çim");
		gamer1.setNationalityId("13876564589");
		gamer1.setDateOfBirthDate(LocalDate.of(1999, 2, 12));
		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("VALORANT");
		game1.setPrice(153);
		game1.setDescription("VALORANT Heyecani devam ediyor.");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Bahar Kampanyasi");
		campaign1.setDiscountRate(15);
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game1);
		sale1.setGamer(gamer1);	
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.add(sale1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.add(sale1, campaign1);


	}

}
