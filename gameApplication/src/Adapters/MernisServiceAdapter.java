package Adapters;

import Business.Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		boolean result= false;
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstNameString().toUpperCase(),gamer.getLastName().toUpperCase(), gamer.getDateOfBirthDate().getYear());
		} 
		catch (Exception e) 
		{
			System.out.println("Üye Bilgileri Hatalý");
		}
		
		return result;
	}

}
