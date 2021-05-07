import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {
		 

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new NeroCustomerManager();
        customerManager.save(new Customer(1,"Engin","Demiroð","1985-06-01","28861499108"));
	}
	
	

}
