package Business.Concrete;

import Business.Abstract.GamerCheckService;
import Business.Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;
	
	public 	GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService=gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) 
		{
			System.out.println("Üye Eklendi: " + gamer.getFirstNameString() + " " + gamer.getLastName());
		}
		else {
			System.out.println("Üye Bilgileri Hatali");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer))
		{
			System.out.println("Üye Bilgileri Güncellendi: " + gamer.getFirstNameString() + " " + gamer.getLastName() );
		}
		else {
			System.out.println("Üye Bilgileri Hatalý");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Üye Silindi");
		
	}

}
