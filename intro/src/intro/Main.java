package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// camelCase
		// Don't repeat yourself (DRY)
		String internetSubesiButonu = "�nternet �ubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubesiButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		} else {
			System.out.println("Dolar e�ittir resmi");
		}

		System.out.println("-------------------");
		
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "�ift�i kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		String kredi7 = "K�lt�r bakanl��� kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		System.out.println("-------------------");

		String[] krediler = { "H�zl� kredi", "Mutlu emekli kredisi", "Konut kredisi", "�ift�i kredisi", "Msb kredisi",
				"Meb kredisi", "K�lt�r bakanl��� kredisi" };
		
		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		System.out.println("-------------------");
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
