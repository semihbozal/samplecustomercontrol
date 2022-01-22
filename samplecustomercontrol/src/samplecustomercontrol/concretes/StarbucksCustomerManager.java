package samplecustomercontrol.concretes;

import java.rmi.RemoteException;

import samplecustomercontrol.abstracts.BaseCustomerManager;
import samplecustomercontrol.abstracts.CustomerCheckService;
import samplecustomercontrol.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		try {
			if(customerCheckService.CheckIfRealPerson(customer)) {
				super.Save(customer);
			}
			else {
				throw new java.lang.Error("Customer not valid");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
}
