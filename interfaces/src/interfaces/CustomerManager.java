package interfaces;

public class CustomerManager {
	
	//loosly(gev�ek) - tightly(kat�) coupled(ba�l�)
	
	private Logger[] loggers;//loosly coupled i�in bunu yap�yoruz
	

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi : " + customer.getFirstName());
		
		//----- bu t�r ara� g�revi g�recek olan s�n�flar�m�z� new'lememek i�in s�n�f i�inde metoda
		//----- "static" keyword ekliyoruz
		//Utils utils = new Utils(); 
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//----- Utils'de yapt�k bu i�lemi -----		
		/*for (Logger logger : loggers) { 
			logger.log(customer.getFirstName());
		}*/
		
		
		//this.logger.log(customer.getFirstName());//loosly coupled
		
		//----- bu tightly coupled -----
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri taban�na logland�");
	}

	public void delete(Customer customer) {
		System.out.println("M��teri silindi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//this.logger.log(customer.getFirstName()); //tek de�er i�in
	}
}
