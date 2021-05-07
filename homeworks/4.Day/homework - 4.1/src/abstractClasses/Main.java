package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
		
		//--- bunu yazýnca otomatik getiriyor yani abstract sýnýflar asla new'lenemez
		//--- new'lene bilmesi için onun operasyonlarýný aynen þurdaki imzada kullanýmda olduðu gibi ezmemiz gerek
		//--- bu güzel yöntem deðil
		/*GameCalculator gameCalculator = new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};*/

	}

}
