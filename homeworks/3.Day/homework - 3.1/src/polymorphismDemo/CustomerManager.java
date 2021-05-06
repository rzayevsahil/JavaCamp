package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add() {
		System.out.println("Müþteri eklendi");
		this.logger.log("log mesajý");

		// DatabaseLogger logger = new DatabaseLogger();
		// logger.Log("Log mesajý");
	}
}
