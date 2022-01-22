package samplecustomercontrol.adapters;


import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import samplecustomercontrol.abstracts.CustomerCheckService;
import samplecustomercontrol.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService{
	
	
	boolean res = false;
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicLocator kpsLocator = new KPSPublicLocator();
		try {
			KPSPublicSoap kpsPublicSoap = kpsLocator.getKPSPublicSoap();
			res = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.name, customer.surname,customer.birthYear);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

}
