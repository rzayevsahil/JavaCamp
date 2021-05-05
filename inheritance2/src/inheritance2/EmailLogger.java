package inheritance2;

public class EmailLogger extends Logger {
	@Override  //Logger de vardý ama ben kendi kodumu yazýyorum diye ezdim demek
	public void log() {
		System.out.println("Email yollandý");
	}
}
