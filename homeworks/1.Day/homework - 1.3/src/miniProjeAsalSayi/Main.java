package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir Say� Girin: ");
		int number = scanner.nextInt();
		// int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;

		if (number < 1) {
			System.out.println("Ge�ersiz say�");
		}
		if (number == 1) {
			System.out.println("Say� asal de�ildir!");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Say� asald�r");
		} else {
			System.out.println("Say� asal de�ildir!");
		}

	}

}
