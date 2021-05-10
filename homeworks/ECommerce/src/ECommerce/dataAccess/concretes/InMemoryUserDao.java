package ECommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerce.dataAccess.abstracts.UserDao;
import ECommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users=new ArrayList<User>();
	
	public InMemoryUserDao() {
		
		//System.out.println("---Kullanýcýlar---");
		User user1=new User(1, "Sahil", "Rzayev", "sahilrzayev@gmail.com", "777777");
		User user2=new User(2, "Engin", "Demiroð", "engindemirog@gmail.com", "123456");
		
		users.add(user1);
		users.add(user2);

		
	}
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " - isimli kullanýcý eklendi");
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " - isimli kullanýcý güncellendi");		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " - isimli kullanýcý silindi");
		users.remove(user);
		
	}

	@Override
	public User get(int id) {
		User user=users.stream().filter(u->u.getId()==id).findFirst().orElse(null);
		System.out.println("Kullanýcý adý: " + user.getFirstName());
		return user;
	}

	@Override
	public List<User> getAll() {
		for (User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());			
		}
		System.out.println("----------------");
		return this.users;
	}

	@Override
	public User getEmail(String email) {
		User user=users.stream().filter(u->u.getEmail()==email).findFirst().orElse(null);
		return user;
	}
	
}
