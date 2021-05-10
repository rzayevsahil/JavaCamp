package ECommerce;

import java.util.Scanner;

import ECommerce.business.abstracts.AuthService;
import ECommerce.business.abstracts.UserService;
import ECommerce.business.concretes.AuthManager;
import ECommerce.business.concretes.EmailManager;
import ECommerce.business.concretes.UserManager;
import ECommerce.core.googleRegisterAdapter.GoogleManager;
import ECommerce.dataAccess.concretes.InMemoryUserDao;
import ECommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		AuthService google = new GoogleManager();
		
		Scanner scan=new Scanner(System.in);
		
		User user1=new User();
		user1.setId(1);
		user1.setFirstName("Sahil");
		user1.setLastName("Rzayev");
		user1.setEmail("sahilrzayev@gmail.com");
    	user1.setPassword("777777");
    	
		User user2=new User();
		user2.setId(3);
		user2.setFirstName("Kerem");
	    user2.setLastName("Varýþ");
		user2.setEmail("keremvaris@gmail.com");
    	user2.setPassword("555555");
    	
    	
    	UserService userService=new UserManager(new InMemoryUserDao(),new AuthManager(),new EmailManager());
		userService.getAll();
		//InMemory conctructerýnda yukarýdaki mailin aynýsý olduðu için hata vericektir
			//userService.add(user2);
		
		//**************************
		/*userService.add(user2);
		int verificationCode=scan.nextInt();
		userService.userVerify(user2, verificationCode);
		userService.getAll();*/
		
		//**************************
		/*userService.delete(user2);
		userService.getAll();*/
		
		//**************************		
		//userService.get(2);
		
		google.login(user1);
		
		
		
		
		
		

	}

}
