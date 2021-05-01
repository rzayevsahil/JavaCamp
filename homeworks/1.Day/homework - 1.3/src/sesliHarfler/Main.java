package sesliHarfler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {

			System.out.print("Bir karakter giriniz : ");
			char harf = scanner.next().toUpperCase().charAt(0);
			System.out.print(harf);

			switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(" --> Kalýn sesli harf");
				break;
			case 'E':
			case 'Ö':
			case 'Ü':
			case 'Ý':
				System.out.println(" --> Ýnce sesli harf");
				break;
			default:
				System.out.println(" --> Girdiðiniz sesli harf deðildir!!!");
				break;
			}
		}

	}

}
