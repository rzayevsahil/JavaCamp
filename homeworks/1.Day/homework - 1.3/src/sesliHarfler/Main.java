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
				System.out.println(" --> Kal�n sesli harf");
				break;
			case 'E':
			case '�':
			case '�':
			case '�':
				System.out.println(" --> �nce sesli harf");
				break;
			default:
				System.out.println(" --> Girdi�iniz sesli harf de�ildir!!!");
				break;
			}
		}

	}

}
