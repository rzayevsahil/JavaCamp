package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kayedildi.");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
//SOLID - Open Closed Principle --> sisteme yeni özellik eklendiðinde mevcutta bulunan hiçbir kodu deðiþtiremezsin, sadece yeni kod ekleyebilirsin

