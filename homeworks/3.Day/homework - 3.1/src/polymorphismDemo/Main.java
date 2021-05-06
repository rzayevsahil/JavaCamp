package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// EmailLogger emailLogger = new EmailLogger();
		// emailLogger.log("Log mesaj�");

		/*BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
				new ConsoleLogger() };
		for (BaseLogger logger : loggers) {
			logger.log("Log mesaj�");
		}*/
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
