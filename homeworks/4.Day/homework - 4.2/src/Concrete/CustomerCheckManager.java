package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
