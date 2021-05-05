package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		//DatabaseLogger databaseLogger = new DatabaseLogger(); - bu koddan hayýr gelmez
		logger.log();
	}
}
