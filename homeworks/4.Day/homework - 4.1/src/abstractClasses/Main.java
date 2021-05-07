package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
		
		//--- bunu yaz�nca otomatik getiriyor yani abstract s�n�flar asla new'lenemez
		//--- new'lene bilmesi i�in onun operasyonlar�n� aynen �urdaki imzada kullan�mda oldu�u gibi ezmemiz gerek
		//--- bu g�zel y�ntem de�il
		/*GameCalculator gameCalculator = new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};*/

	}

}
