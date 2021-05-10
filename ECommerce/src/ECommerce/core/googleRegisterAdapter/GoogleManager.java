package ECommerce.core.googleRegisterAdapter;

import ECommerce.business.abstracts.AuthService;
import ECommerce.core.utilities.BusinessRules;
import ECommerce.entities.concretes.User;
import ECommerce.signUpWithGoogle.Register;

public class GoogleManager implements AuthService{
	Register register = new Register();

	@Override
	public boolean login(User user) {
		boolean result=register.register(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getPassword());
		if (!result && !this.validate(user)) {
				System.out.println("Sisteme giri� ba�ar�s�z!");
				return false;
		}
		System.out.println("Sisteme giri� yap�ld�.");
		return true;
	}

	@Override
	public boolean validate(User user) {
		boolean result = BusinessRules.Run(emailAndPasswordCheck(user));
		return result;
	}
	
	
	private boolean emailAndPasswordCheck(User user) {
		if (user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Kullan�c� ad� veya parola eksik!");
			return false;
		}
		System.out.println(user.getFirstName()+" "+user.getLastName()+" - isimli kullan�c� Google ile ba�ar�yla kay�t oldu...");
		return true;
	}
}
