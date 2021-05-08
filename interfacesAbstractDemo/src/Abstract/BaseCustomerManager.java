package Abstract;

import Entities.Customer;

public  abstract class BaseCustomerManager implements CustomerService  {
	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database " + customer.getFirsName());   //Simulation let think this code works for saved to database
		
	}
	
	

}
