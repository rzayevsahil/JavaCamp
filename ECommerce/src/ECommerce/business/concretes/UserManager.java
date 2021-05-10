package ECommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerce.business.abstracts.AuthService;
import ECommerce.business.abstracts.EmailService;
import ECommerce.business.abstracts.UserService;
import ECommerce.dataAccess.abstracts.UserDao;
import ECommerce.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private AuthService authService;
	private EmailService emailService;
	
	public UserManager(UserDao userDao, AuthService authService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailService = emailService;
	}
	
	List<User> users=new ArrayList<User>();
	
	public UserManager() {
		users.add((User) this.getAll());
	}

	@Override
	public void add(User user) {
		if(userCheck(user.getEmail()) && authService.validate(user)){
			userDao.add(user);
			System.out.println("Do�rulama Kodunuz Mail Olarak G�nderildi! Do�rulama Kodunuz: " + emailService.emailSend());
			System.out.print("Do�rulama Kodunu Giriniz: ");
				return;
		}
		System.out.println("Kullan�c� bilgilerini kontrol ediniz!");
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		User result=this.userDao.get(id);
		return result;
	}

	@Override
	public List<User> getAll() {
		System.out.println("---Kullan�c�lar---");
		List<User> result=this.userDao.getAll();
		return result;
	}

	@Override
	public void userVerify(User user, int verificationCode) {
		int code=emailService.emailSend();
		
		if (code==verificationCode) {			
			System.out.println("Kullan�c� do�ruland�. Ba�ar�yla �ye oldunuz!!! "+user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Do�rulama kodunuz yanl��!");
		}
		
		
	}
	
	
	public boolean userCheck(String email) {
		if (userDao.getEmail(email)!=null) {
			System.out.println("Kullan�c� mevcut!");
			return false;
		}
		
		return true;
	}

}
