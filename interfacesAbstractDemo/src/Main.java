


import java.rmi.RemoteException;
import java.util.GregorianCalendar;


import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;



public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setFirsName("Ýbrahim");
		customer.setLastName("Kaplan");
		customer.setNationalityId("0123456789");
		customer.setDateOfBirthDate(new GregorianCalendar(1992, 11, 7).getTime());
		customer.setDateBirth(1881);
		customer.setId(1);
		
		customerManager.save(customer);
		customerManager2.save(customer);
				
		
		
		
		
	}

}
