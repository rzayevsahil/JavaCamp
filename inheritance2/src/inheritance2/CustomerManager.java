package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		//DatabaseLogger databaseLogger = new DatabaseLogger(); - bu koddan hay�r gelmez
		logger.log();
	}
}
