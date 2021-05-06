package interfaces;

public class CustomerManager {
	
	//loosly(gevþek) - tightly(katý) coupled(baðlý)
	
	private Logger[] loggers;//loosly coupled için bunu yapýyoruz
	

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : " + customer.getFirstName());
		
		//----- bu tür araç görevi görecek olan sýnýflarýmýzý new'lememek için sýnýf içinde metoda
		//----- "static" keyword ekliyoruz
		//Utils utils = new Utils(); 
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//----- Utils'de yaptýk bu iþlemi -----		
		/*for (Logger logger : loggers) { 
			logger.log(customer.getFirstName());
		}*/
		
		
		//this.logger.log(customer.getFirstName());//loosly coupled
		
		//----- bu tightly coupled -----
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri tabanýna loglandý");
	}

	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//this.logger.log(customer.getFirstName()); //tek deðer için
	}
}
