package samplecustomercontrol.abstracts;

import java.rmi.RemoteException;

import samplecustomercontrol.entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
