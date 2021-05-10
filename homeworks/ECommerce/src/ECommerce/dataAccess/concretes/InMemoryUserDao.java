package ECommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerce.dataAccess.abstracts.UserDao;
import ECommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users=new ArrayList<User>();
	
	public InMemoryUserDao() {
		
		//System.out.println("---Kullan�c�lar---");
		User user1=new User(1, "Sahil", "Rzayev", "sahilrzayev@gmail.com", "777777");
		User user2=new User(2, "Engin", "Demiro�", "engindemirog@gmail.com", "123456");
		
		users.add(user1);
		users.add(user2);

		
	}
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " - isimli kullan�c� eklendi");
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " - isimli kullan�c� g�ncellendi");		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " - isimli kullan�c� silindi");
		users.remove(user);
		
	}

	@Override
	public User get(int id) {
		User user=users.stream().filter(u->u.getId()==id).findFirst().orElse(null);
		System.out.println("Kullan�c� ad�: " + user.getFirstName());
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
