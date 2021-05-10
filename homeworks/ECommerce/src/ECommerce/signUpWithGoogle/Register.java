package ECommerce.signUpWithGoogle;

public class Register {
public boolean register(int id,String firsName,String lastName,String email,String password){
		
		if (firsName.length()>5 && lastName.length()>5&&email.length()>5&&password.length()>5) {
			return true;
		}
		return false;	
	}
}
