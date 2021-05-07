package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		//OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
		databaseManager.getData();
	}
}
