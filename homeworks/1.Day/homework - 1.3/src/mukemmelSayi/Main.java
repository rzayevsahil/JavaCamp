package mukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir deðer giriniz :");
		int number = scanner.nextInt();
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (total == number) {
			System.out.println(number + " --> mükemmel sayýdýr");
		} else
			System.out.println(number + " --> mükemmel sayý deðildir");

	}

}
