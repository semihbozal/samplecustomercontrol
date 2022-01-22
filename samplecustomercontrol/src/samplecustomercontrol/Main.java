package samplecustomercontrol;

import samplecustomercontrol.abstracts.BaseCustomerManager;
import samplecustomercontrol.adapters.MernisServiceAdapter;
import samplecustomercontrol.concretes.StarbucksCustomerManager;
import samplecustomercontrol.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customer = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer c = new Customer(1,"Mehmet","Aurelio","11111111111",1985);
		customer.Save(c);

	}

}
