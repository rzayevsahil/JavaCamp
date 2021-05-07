package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	// --- 1.yöntem - sadece bunu yaparsak eðer 
	// --- customerManager.customerDal=new MySqlCustomerDal(); böyle biþey tanýmlamamýz lazým
	//ICustomerDal customerDal; 
	
	public void add() {
		//iþ kodlarý yazýlýr
		customerDal.add();
	}
}
