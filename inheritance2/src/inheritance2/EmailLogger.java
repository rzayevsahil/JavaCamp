package inheritance2;

public class EmailLogger extends Logger {
	@Override  //Logger de vard� ama ben kendi kodumu yaz�yorum diye ezdim demek
	public void log() {
		System.out.println("Email yolland�");
	}
}
