package Adapter;

import java.rmi.RemoteException;

import Abstract.UserValidationService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService {

	@Override
	public boolean validation(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()), gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getBirthYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}
