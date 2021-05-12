import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer){
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result  = false;
		try {
		result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName(), customer.getLastName(),
				Integer.valueOf(customer.getDateOfBirth()));			
		}catch(RemoteException e){
			
			e.printStackTrace();
		}
			return result;
		}
}
