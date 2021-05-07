package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		//customerManager.customerDal=new MySqlCustomerDal(); 1.yöntem
		customerManager.add();

	}

}
