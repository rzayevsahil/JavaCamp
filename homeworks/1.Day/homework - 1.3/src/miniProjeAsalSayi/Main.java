package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir Sayý Girin: ");
		int number = scanner.nextInt();
		// int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;

		if (number < 1) {
			System.out.println("Geçersiz sayý");
		}
		if (number == 1) {
			System.out.println("Sayý asal deðildir!");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Sayý asaldýr");
		} else {
			System.out.println("Sayý asal deðildir!");
		}

	}

}
