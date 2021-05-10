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
				System.out.println("Sisteme giriþ baþarýsýz!");
				return false;
		}
		System.out.println("Sisteme giriþ yapýldý.");
		return true;
	}

	@Override
	public boolean validate(User user) {
		boolean result = BusinessRules.Run(emailAndPasswordCheck(user));
		return result;
	}
	
	
	private boolean emailAndPasswordCheck(User user) {
		if (user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Kullanýcý adý veya parola eksik!");
			return false;
		}
		System.out.println(user.getFirstName()+" "+user.getLastName()+" - isimli kullanýcý Google ile baþarýyla kayýt oldu...");
		return true;
	}
}
