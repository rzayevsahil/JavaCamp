package overriding;

public class Main {

	public static void main(String[] args) {
		// OgretmenCreditManager ogretmenCreditManager = new OgretmenCreditManager();
		// System.out.println(ogretmenCreditManager.hesapla(1000));

		BaseCreditManager[] creditManagers = new BaseCreditManager[] { new OgretmenCreditManager(),
				new TarimCreditManager(), new OgrenciCreditManager() };

		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.hesapla(1000));
		}
	}

}
