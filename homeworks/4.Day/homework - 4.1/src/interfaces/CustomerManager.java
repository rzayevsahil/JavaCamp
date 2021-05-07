package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	// --- 1.y�ntem - sadece bunu yaparsak e�er 
	// --- customerManager.customerDal=new MySqlCustomerDal(); b�yle bi�ey tan�mlamam�z laz�m
	//ICustomerDal customerDal; 
	
	public void add() {
		//i� kodlar� yaz�l�r
		customerDal.add();
	}
}
