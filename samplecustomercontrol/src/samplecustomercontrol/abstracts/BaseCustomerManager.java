package samplecustomercontrol.abstracts;

import samplecustomercontrol.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	@Override
	public void Save(Customer customer) {
		System.out.print(customer.name + " added to db!");
	}
	
}
