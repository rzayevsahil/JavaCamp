package ECommerce.business.abstracts;

import ECommerce.entities.concretes.User;

public interface AuthService {
	boolean login(User user);
	boolean validate(User user);	
}
