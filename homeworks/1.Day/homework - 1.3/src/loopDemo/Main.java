package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// -----> For Loop <-----
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}		
		System.out.println("For dongusu bitti\n");
		
		
		System.out.println("----------------------\n");		
		
		
		// -----> While Loop <-----
		int i=1;
		while (i<10) {
			System.out.println(i);
			i+=2;
		}		
		System.out.println("While dongusu bitti\n");
		
		
		System.out.println("----------------------\n");		
		
		
		// -----> Do-While Loop <-----
		int j = 1;
		while (j < 10) {
			System.out.println(j);
			j+=2;
		}		
		System.out.println("Do-While dongusu bitti\n");

	}

}
