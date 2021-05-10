package ECommerce.business.abstracts;

import java.util.List;

import ECommerce.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getAll();
	void userVerify(User user,int verificationCode);
}
