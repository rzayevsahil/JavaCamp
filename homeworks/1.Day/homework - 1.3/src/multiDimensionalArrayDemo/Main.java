package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Gaziantep";
		
		for (int i = 0; i < sehirler.length; i++) {			
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("-------------------");
		}

	}

}
