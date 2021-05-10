package ECommerce.business.concretes;

import java.util.Random;

import ECommerce.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	int verificationCode;
	public EmailManager() {
		Random code=new Random();
		this.verificationCode=code.nextInt(1000)*10;
	}
	
	@Override
	public int emailSend() {
		return this.verificationCode;
	}

}
